package simpleFrame;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SimpleFrameTest {
    public static void main(String[] args){
    	EventQueue.invokeLater(() ->
    	{
    		Toolkit kit = Toolkit.getDefaultToolkit();
    		Dimension screenSize = kit.getScreenSize();
    		int screenWidth = screenSize.width;
    		int screenHeight = screenSize.height;
    		SimpleFrame frame = new SimpleFrame();
    		frame.setSize(screenWidth / 2, screenHeight / 2);
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setVisible(true);
    		frame.setTitle("Hello");
    		frame.setResizable(true);
    		Image img = new ImageIcon("C:\\temp\\copy_l_co.gif").getImage();
    		frame.setIconImage(img);
    		frame.setLocation(100, 50);
    		System.out.println(frame.isLocationByPlatform());
    		//frame.setLocationByPlatform(true);
    		//frame.setBounds(100, 100, 400, 400);
    		System.out.println(frame.getTitle());
    	});
    }
}


