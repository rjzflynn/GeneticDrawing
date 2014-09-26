package geneticapp;

import geneticapp.Interface.GUI;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;


public class GeneticAlgo implements Runnable{
    
    private DNAString currentDNAStr;
    private BufferedImage currentDNA_Img;
    private GUI gui;
    private SettingsManager config;
    private static Random randomNumberGenerator; 
    private FitnessCalculator fitnessCalc;
    
    //information for Screen Display
    private double currentFitness;
    private double fitnessPercent;
    private int benefitialMutations;
    private int mutations;
    private boolean paused;


    public GeneticAlgo() {
        randomNumberGenerator = new Random();
        fitnessCalc = new FitnessCalculator();
        config = new SettingsManager();
    }
    
   
    public void evolve() {
       
       //0) Setup a random DNA string   
       setupRandomDNAString();
       
        while (fitnessPercent < 100.0) {
            if (!isPaused()) {   
                
                //1) Copy the current DNA sequence and mutate it slightly
                DNAString copy = copyDNAString(currentDNAStr);
                mutate(copy);
                                
                //2) Use the new DNA to render polygons onto a canvas
                BufferedImage mutatedImage = getBufferedImageFromDNA(copy);
                //3) Compare the canvas to the source image
                double mutatedFitness = fitnessCalc.getFitness(mutatedImage);
                
                //4) If the new painting looks more like the source image
                //   than the previous painting did, then overwrite the current DNA with the new DNA
                if (mutatedFitness < currentFitness) {
                    currentDNAStr = copy;
                    currentFitness = mutatedFitness;
                    setCurrentDNA_Img(mutatedImage);                 
                    benefitialMutations++;
                }
                update();
                //5) repeat from 1
            }
             System.out.print("");   
        }
    }
    
   
/* 
 *          Helper/Utility Methods
*/
    
    private void update(){
        fitnessPercent = 100 * (1 - currentFitness / (200 * 200 * 3 * 255));
        updateGUI();
        mutations++;
    }
    
    private void setupRandomDNAString(){
        currentDNAStr = new DNAString(config.getNumOfPolygons(), config.getPointsInPolygon(), config.getInitialDNA());
        calculateCurrentFitness();
    }
    
    private void calculateCurrentFitness(){
        currentDNA_Img = getBufferedImageFromDNA(currentDNAStr);
        currentFitness = fitnessCalc.getFitness(currentDNA_Img);
    }
    
    private DNAString copyDNAString (DNAString toCopy){
        return new DNAString(toCopy.toString());
    }
    
    
    private void mutate(DNAString dna){
        switch (config.getMutationStratagy()) {
            case SettingsManager.HARD:
                dna.mutateHard();
                break;
            case SettingsManager.MEDIUM:
                dna.mutateMedium();
                break;
            case SettingsManager.SOFT:
                dna.mutateSoft();
                break;
        }
    }
    
    @Override
    public void run() {
        evolve();
    }
    
      public void start(){
        Thread workerThread = new Thread(this);
        workerThread.start(); 
    }
    
    public void reset(){
        benefitialMutations = 0;
        mutations = 0;
    }
    
    void updateGUI(){
        gui.updateStats();
    }
    
    void updateGeneratedImage(){
        gui.updateGeneratedImage();
    }
    
    private BufferedImage getBufferedImageFromDNA(DNAString dna) {
        BufferedImage buff = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        Graphics graph = buff.createGraphics();
        graph.setColor(Color.WHITE);
        graph.fillRect(0, 0, 200, 200);
        for (int i = 0; i < dna.getGenes().size(); i++) {
            dna.getGenes().get(i).paintGene(graph);
        }
        return buff;
    }
    
     
     static int randInt(int min, int max) {
        return randomNumberGenerator.nextInt((max - min) + 1) + min;
    }

    static float randFloat() {
        return randomNumberGenerator.nextFloat();
    }
    
     
/* 
 *          Setters
*/
    
     public void setCurrentDNA_Img(BufferedImage currentDNA_Img) {
        this.currentDNA_Img = currentDNA_Img;
        updateGeneratedImage();
    }
     
     public void setGui(GUI gui) {
        this.gui = gui;
    }
     
     public void setPaused(boolean paused) {
        this.paused = paused;
    }
     
        
     
/* 
 *          Getters
*/
     
     public BufferedImage getCurrentDNA_Img() {
        return currentDNA_Img;
    }

    public DNAString getCurrentDNAStr() {
        return currentDNAStr;
    }
    
     public SettingsManager getConfig() {
        return config;
    }
     
      public FitnessCalculator getFitnessCalc() {
        return fitnessCalc;
    }
      
      public int getMutations() {
        return mutations;
    }

    public int getBenefitialMutations() {
        return benefitialMutations;
    }

    public double getFitnessPercent() {
        return fitnessPercent;
    }
    
      public boolean isPaused() {
        return paused;
    }
    
    
    
}
