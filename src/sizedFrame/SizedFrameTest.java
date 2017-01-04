package sizedFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SizedFrameTest {
    public static void main(String[] args){
    	EventQueue.invokeLater(() ->
    	{
    		JFrame frame = new SizedFrame();
    		frame.setTitle("SizedFrame");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setVisible(true);
    	});
    }
}
