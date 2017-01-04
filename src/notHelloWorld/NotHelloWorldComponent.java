package notHelloWorld;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

import javax.swing.JComponent;

public class NotHelloWorldComponent extends JComponent {
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;
	
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public void paintComponent(Graphics g){
		Font sansbold14 = new Font("SansSerif", Font.BOLD, 14);
		g.setFont(sansbold14);
		g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);	
		String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String fontName : fontNames){
			System.out.println(fontName);
		}
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
