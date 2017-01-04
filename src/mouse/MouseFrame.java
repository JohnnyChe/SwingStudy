package mouse;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class MouseFrame extends JFrame{
    public MouseFrame(){
    	add(new MouseComponent());
    	pack();
    }
    
    public static void main(String[] args){
		EventQueue.invokeLater(() ->
    	{
    		JFrame frame = new MouseFrame();
    		frame.setTitle("MouseTest");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setVisible(true);
    	});
	}
}
