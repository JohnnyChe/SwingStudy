package draw;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class DrawTest {
    public static void main(String[] args){
    	EventQueue.invokeLater(() ->
    	{
    		JFrame frame = new DrawFrame();
    		frame.setTitle("DrawTest");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setVisible(true);
    	});
    }
}
