package draw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class DrawComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;
    
    public void paintComponent(Graphics g){
    	Graphics2D g2 = (Graphics2D) g;
    	
    	double leftX  = 100;
    	double topY   = 100;
    	double width  = 200;
    	double height = 150;
    	
    	
    	
    	//draw Rectangle
    	Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
    	g2.setPaint(Color.WHITE);
    	g2.fill(rect);
    	g2.setPaint(Color.BLACK);
    	g2.draw(rect);
    	
    	//draw ellipse
    	Ellipse2D ellipse = new Ellipse2D.Double();
    	ellipse.setFrame(rect);
    	g2.setPaint(Color.MAGENTA);
    	g2.draw(ellipse);
    	
    	g2.setPaint(new Color(155,155,155));
    	g2.fill(ellipse);
    	
    	//draw line
    	g2.setPaint(Color.BLUE);
    	g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));
    	
    	
    	//draw a circle
    	double centerX = rect.getCenterX();
    	double centerY = rect.getCenterY();
    	double radius = Math.sqrt(width * width + height * height) / 2;
    	
    	Ellipse2D circle = new Ellipse2D.Double();
    	circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
    	g2.setPaint(Color.RED);
    	g2.draw(circle);    	
    	
    	Font sansbold14 = new Font("SansSerif", Font.BOLD, 14);
    	FontRenderContext context = g2.getFontRenderContext();
    	Rectangle2D bounds = sansbold14.getStringBounds("Hello World", context);
    }
    
    public Dimension getPreferredSize(){
    	return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
