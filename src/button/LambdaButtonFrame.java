package button;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LambdaButtonFrame extends JFrame {
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	
	
	public LambdaButtonFrame(){		
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		buttonPanel = new JPanel();
		
		//create buttons.
		makeButton("yellow", Color.YELLOW);
		makeButton("blue", Color.BLUE);
		makeButton("red", Color.RED);
		
		// add panel to frame
		add(buttonPanel);
	}
	
	public void makeButton(String name, Color backgroundColor){
		JButton button = new JButton(name);
		buttonPanel.add(button);
		button.addActionListener(event -> buttonPanel.setBackground(backgroundColor));
	}
			
	public static void main(String[] args){
		EventQueue.invokeLater(() ->
    	{
    		JFrame frame = new ButtonFrame();
    		
    		//String className = "com.sun.java.swing.plaf.motif.MotifLookAndFeel"; //CDE/Motif
    		//String className = "com.sun.java.swing.plaf.metal.MetalLookAndFeel"; //Metal
    		//String className = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel"; //Windows
    		//String className = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"; //Windows Classic
    		String className = "javax.swing.plaf.nimbus.NimbusLookAndFeel"; //Nimbus
    		try{
    			UIManager.setLookAndFeel(className);
    			SwingUtilities.updateComponentTreeUI(frame);
    			//frame.pack();
    			UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
    			for(UIManager.LookAndFeelInfo info:infos){
    				System.out.println("Name : " + info.getName());
    				System.out.println("Name : " + info.getClassName());
    			}
    		} catch(Exception e){
    			e.printStackTrace();
    		}
    		
    		frame.setTitle("ButtonTest");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setVisible(true);
    	});
	}
}