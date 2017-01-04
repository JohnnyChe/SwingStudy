package checkBox;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxFrame extends JFrame {
    private JLabel label;
    private JCheckBox bold;
    private JCheckBox italic;
    private static final int FONT_SIZE = 24;
    
    public CheckBoxFrame(){
    	label = new JLabel("The quick brown fox jumps over the lazy dog.");
    	label.setFont(new Font("Serif", Font.BOLD, FONT_SIZE));
    	
    }
    
    public static void main(String[] args){
    	EventQueue.invokeLater(()->
    	{
    		JFrame frame = new CheckBoxFrame();
    		
    		frame.setVisible(true);
    	});
    }
}
