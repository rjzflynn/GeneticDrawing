
package geneticapp;

import geneticapp.Interface.CanvasPanel;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.CachedImageHandlerPNGEncoder;
import org.apache.batik.svggen.GenericImageHandler;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.svggen.SVGGraphics2DIOException;
import org.w3c.dom.DOMImplementation;

public class SVGGenerator {  //Class for generateing SVGs
                            //The method generateSVG generates a SVG from the graphics of a JPanel subclass
                           //and writes it to the provided Outputstream
    
     private  CachedImageHandlerPNGEncoder ihandler;  

    public SVGGenerator() {
        try {
            ihandler =  new CachedImageHandlerPNGEncoder("res/images", null);
        } catch (SVGGraphics2DIOException ex) {}
    }
     
    public void generateSVG(CanvasPanel myCanvas, OutputStream outStream)  {
        String svgNS = "http://www.w3.org/2000/svg";

        DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
        org.w3c.dom.Document myFactory = domImpl.createDocument(svgNS, "svg", null);
        SVGGeneratorContext ctx = SVGGeneratorContext.createDefault((org.w3c.dom.Document) myFactory);
        ctx.setGenericImageHandler((GenericImageHandler) ihandler);


        SVGGraphics2D svgGenerator = new SVGGraphics2D(ctx, false);

        myCanvas.paintComponent(svgGenerator);

        Writer out = null;
        try {
            out = new OutputStreamWriter(outStream, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SVGGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            svgGenerator.stream(out, true);
        } catch (SVGGraphics2DIOException ex) {
            Logger.getLogger(SVGGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
}