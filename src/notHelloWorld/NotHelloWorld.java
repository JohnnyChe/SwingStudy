package notHelloWorld;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class NotHelloWorld {
    public static void main(String[] args){
    	EventQueue.invokeLater(() ->
    	{
    		JFrame frame = new NotHelloWorldFrame();
    		frame.setTitle("NotHelloWorld");
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setVisible(true);
    	});
    }
}
