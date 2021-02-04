import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	
	MyPanel panel;
	
	MyFrame() {
		
		panel = new MyPanel();
		this.add(panel);
		this.setTitle("Pong");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}

}
