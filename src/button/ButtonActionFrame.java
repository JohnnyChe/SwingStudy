package button;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ButtonActionFrame extends JFrame {
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public ButtonActionFrame(){
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		buttonPanel = new JPanel();

		// add panel to frame
		add(buttonPanel);
		
		//create button actions.
		Action yellowAction = new ColorAction("Yellow", new ImageIcon("C:\\temp\\copy_l_co.gif"), Color.YELLOW);
		Action blueAction = new ColorAction("Blue", new ImageIcon("C:\\temp\\copy_l_co.gif"), Color.BLUE);
		Action redAction = new ColorAction("Red", new ImageIcon("C:\\temp\\copy_l_co.gif"), Color.RED);
		
		//create buttons.
		JButton yellowButton = new JButton(yellowAction);
		JButton blueButton   = new JButton(blueAction);
		JButton redButton    = new JButton(redAction);
		
		JButton yellowButton2 = new JButton(yellowAction);
		JButton blueButton2   = new JButton(blueAction);
		JButton redButton2    = new JButton(redAction);
		
		//add buttons to panel
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.add(yellowButton, BorderLayout.SOUTH);
		buttonPanel.add(blueButton, BorderLayout.NORTH);
		buttonPanel.add(redButton, BorderLayout.WEST);
		
		buttonPanel.add(yellowButton2, BorderLayout.CENTER);
		buttonPanel.add(blueButton2, BorderLayout.EAST);
		//buttonPanel.add(redButton2);
		
	//	buttonPanel.add(new JButton(redAction));
		//buttonPanel.add(new JButton(redAction));
/*		buttonPanel.add(new JButton(redAction));
		buttonPanel.add(new JButton(redAction));
		buttonPanel.add(new JButton(redAction));
		buttonPanel.add(new JButton(redAction));
		buttonPanel.add(new JButton(redAction));
		buttonPanel.add(new JButton(redAction));
		buttonPanel.add(new JButton(redAction));
*/		

	}
	
	private class ColorAction extends AbstractAction {
	    private Color backgroundColor;
	    
	    public ColorAction(String name, Icon icon, Color c){
	    	putValue(Action.NAME, name);
	    	putValue(Action.SMALL_ICON, icon);
	    	putValue("color", c);
	    	putValue(Action.SHORT_DESCRIPTION, "Set panel color to " + name.toLowerCase());
	    }
	    
	    public void actionPerformed(ActionEvent event){
	    	Color c = (Color) getValue("color");
	    	buttonPanel.setBackground(c);
	    }
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(() ->
    	{
    		JFrame frame = new ButtonActionFrame();
    		frame.setTitle("ButtonTest");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setVisible(true);
    	});
	}
}