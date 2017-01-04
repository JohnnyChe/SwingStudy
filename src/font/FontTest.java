package font;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class FontTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> 
		{
			JFrame frame = new FontFrame();
			frame.setTitle("FontTest");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});

	}

}
