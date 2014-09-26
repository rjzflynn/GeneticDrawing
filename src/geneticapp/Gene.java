package geneticapp;

import static geneticapp.GeneticAlgo.randInt;
import java.awt.*;


public class Gene {   //a gene encapsulates a polygon

    /*  Object Struture:
     * index: 0 1 2 3 4  5  6 ... 7  8  9 ...     
     * value: R G B A x1 x2 x3... y1 y2 y3...
     */
    
    private String[] values;
    private int numPointsInPolygon;

    public Gene(String g) {
        values = g.split("[ ]");
        numPointsInPolygon = (values.length - 4) / 2;
    }

    public Gene(int pointsInPolygon, int initialColor) {
        numPointsInPolygon = pointsInPolygon;
        String str = "";
        switch (initialColor) {
            case SettingsManager.BLACK: str = "" + 0 + " " + 0 + " " + 0 + " " + "0.5" + " "; break;
            case SettingsManager.WHITE: str = "" + 255 + " " + 255 + " " + 255 + " " + "0.5" + " "; break;
            case SettingsManager.COLOR: str = "" + randInt(0, 255) + " " + randInt(0, 255) + " "
                        + randInt(0, 255) + " " + "0.5" + " "; break;
        }
        for (int i = 0; i < pointsInPolygon * 2; i++) {
            str += randInt(0, 200) + " ";
        }
        str = str.trim();
        values = str.split("[ ]");
    }
    
   
    

    /*
     Mutators:
     */
    
    //Hard mutations change a color and transparency of one polygon to a completely random value 
    //together with changing one coordinate to a completely random value.
    
    protected void hardMutate() {        
        int colorIndex = randInt(0, 2);
        values[colorIndex] = String.valueOf(randInt(0, 255));
        randomizeA();

        int xIndex = randInt(4, (4 + numPointsInPolygon) - 1);
        values[xIndex] = String.valueOf(randInt(0, 200));
 
        int matchingY = xIndex + numPointsInPolygon;
        values[matchingY] = String.valueOf(randInt(0, 200));
           
    }

    //Medium mutations modify exactly one parameter (R,G,B,A,X...,Y... ) by a random amount 
    //within the allowed range(EX:R/G/B range = 0 -> 255)
    
    protected void mediumMutate() {
        int index = randInt(0, (4 + numPointsInPolygon * 2) - 1);
        if (index < 3) {
            mediumMutateColor(index);
        } else if (index == 3) {
            randomizeA();
        } else {
            mediumMutateCoordinate(index);
        }
    }

    private void mediumMutateColor(int index) {
        int newValue = randInt(0, 255);
        values[index] = String.valueOf(newValue);
    }

    private void mediumMutateCoordinate(int index) {
        int newValue = randInt(0, 200);
        values[index] = String.valueOf(newValue);
    }

    //Soft mutations modify exactly one parameter (R, G, B, A, X, Y) by a small amount.
    
    protected void softMutate() {
        int index = randInt(0, (4 + numPointsInPolygon * 2) - 1);
        if (index < 3) {
            softMutateColor(index);
        } else if (index == 3) {
            randomizeA();
        } else {
            softMutateCoordinate(index);
        }
    }

    private void softMutateColor(int index) {
        int currentValue = Integer.valueOf(values[index]);
        int mutateAmoutnt = 0;
        while (true) {
            mutateAmoutnt = randInt(-25, 25);
            if (currentValue + mutateAmoutnt >= 0 && currentValue + mutateAmoutnt <= 255) {
                break;
            }
        }
        values[index] = String.valueOf(currentValue + mutateAmoutnt);
    }

    private void softMutateCoordinate(int index) {
        int currentValue = Integer.valueOf(values[index]);
        int mutateAmount = 0;
        while (true) {
            mutateAmount = randInt(-20, 20);
            if (currentValue + mutateAmount >= 0 && currentValue + mutateAmount <= 200) {
                break;
            }
        }
        values[index] = String.valueOf(currentValue + mutateAmount);
    }

    public void randomizeA() {
        float newA = GeneticAlgo.randFloat();
        setA(newA);
    }
      

    /*
     Getters:
     */
    
    public int getR() {
        return Integer.valueOf(values[0]);
    }

    public int getG() {
        return Integer.valueOf(values[1]);
    }

    public int getB() {
        return Integer.valueOf(values[2]);
    }

    public float getAlpha() {
        return Float.valueOf(values[3]);
    }

    public int getNumPointsInPolygon() {
        return numPointsInPolygon;
    }

    protected int[] getXCords() {
        int[] xCords = new int[numPointsInPolygon];
        int helper = 0;
        for (int i = 4; i < 4 + numPointsInPolygon; i++) {
            xCords[helper] = Integer.valueOf(values[i]);
            helper++;
        }
        return xCords;
    }

    protected int[] getYCords() {
        int[] yCords = new int[numPointsInPolygon];
        int helper = 0;
        for (int i = 4 + numPointsInPolygon; i < values.length; i++) {
            yCords[helper] = Integer.valueOf(values[i]);
            helper++;
        }
        return yCords;
    }
    
     /*
     Setters:
     */
    
    private void setA(float value) {
        values[3] = String.valueOf(value);
    }
    
    
    /*
     Paint Gene Methods:
     */  
     public void paintGene(Graphics graphics) {
        Color color = new Color(this.getR(), this.getG(), this.getB());
        Polygon p = new Polygon(this.getXCords(), this.getYCords(), this.getNumPointsInPolygon());
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setColor(color);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.getAlpha()));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillPolygon(p);
    }
    
    //Multiplies the x and y coords of a gene to get a scaled version
    public void paintGeneEnlarged(int scale, Graphics graphics){
        int[] newX = new int[this.getXCords().length];
        for (int i = 0; i < this.getXCords().length; i++) {
            newX[i] = this.getXCords()[i]  * scale;
        }
        int[] newY = new int[this.getXCords().length];
        for (int i = 0; i < this.getYCords().length; i++) {
            newY[i] = this.getYCords()[i] * scale;
        }
        
        Color color = new Color(this.getR(), this.getG(), this.getB());
        Polygon p = new Polygon(newX, newY, this.getNumPointsInPolygon());
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setColor(color);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, this.getAlpha()));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillPolygon(p);
        
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < values.length; i++) {
            str += values[i] + " ";
        }
        return str.trim();
    }
}
