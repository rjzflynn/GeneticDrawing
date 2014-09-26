
package geneticapp;

import java.awt.Color;
import java.awt.image.BufferedImage;


public class FitnessCalculator { //This class calculates the "fitness" or suitability of a particular image
    private BufferedImage sourceImage;

    public FitnessCalculator() {
    }
    
    public FitnessCalculator(BufferedImage sourceImage) {
        this.sourceImage = sourceImage;
    }

    public void setSourceImage(BufferedImage sourceImage) {
        this.sourceImage = sourceImage;
    }

    public BufferedImage getSourceImage() {
        return sourceImage;
    }
    
     //The fitness function is a pixel by pixel comparison where the fitness for each pixel is summed and compared to the parent.
    protected double getFitness(BufferedImage img){
        double fitness = 0;

        for (int x = 0; x < sourceImage.getWidth(); x++) {
            for (int y = 0; y < sourceImage.getHeight(); y++) {
                Color c1 = new Color(sourceImage.getRGB(x, y));
                Color c2 = new Color(img.getRGB(x, y));

                fitness += Math.abs(c1.getRed() - c2.getRed());
                fitness += Math.abs(c1.getGreen() - c2.getGreen());
                fitness += Math.abs(c1.getBlue() - c2.getBlue());
            }
        }
        return fitness;
    }
}
