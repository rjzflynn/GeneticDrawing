
package geneticapp.Interface;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;


public class ImagePanel extends JPanel{ //Class for drawing a BufferedImage to a JPanel
    
    private BufferedImage image;

    public ImagePanel() {
    }

    public ImagePanel(BufferedImage image) {
        this.image = image;
    }
    
    public void setImage(BufferedImage image){
        this.image = image;
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); 
    }
    
}
