package test;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Test extends JFrame{
	
	public Test(){
		setTitle("test");
		setSize(300,150);
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JTextArea jta = new JTextArea(15,8);
		con.add(jta,BorderLayout.NORTH);
		JButton jb = new JButton("test");
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				jta.append("a");
			}
		});
		con.add(jb,BorderLayout.SOUTH);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args){
		new Test();
	}
}
