
package geneticapp.Interface;

import geneticapp.DNAString;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class CanvasPanel extends JPanel{ //Canvas class for painting/rendering with Graphics2D
    
    DNAString currentDNA;

    public void setCurrentDNA(DNAString currentDNA) {
        this.currentDNA = currentDNA;
    }
    
    
    
     private void renderDNAString(DNAString dna, Graphics gfx) {
        gfx.setColor(Color.WHITE);
        gfx.fillRect(0, 0, this.getWidth(), this.getHeight());
        for (int i = 0; i < dna.getGenes().size(); i++) {
            dna.getGenes().get(i).paintGeneEnlarged(2,gfx);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentDNA != null) {
            renderDNAString(currentDNA, g);
        }       
    }
  
}
