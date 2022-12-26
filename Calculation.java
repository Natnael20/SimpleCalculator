package com.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculation implements ActionListener{
	
	JLabel label, label2, label3;
	JButton addButton, subButton, multiplyButton, divideButton;
	JTextField TF, TF2, TF3;
	int sum, sub, multi, divide;
	String result, result2,result3,result4;
	
	Calculation() {
		label = new JLabel();
		label.setText("Enter an Integer:");
		label.setBounds(0, 0, 100, 100);
		label.setForeground(Color.BLUE);
		
		label2 = new JLabel();
		label2.setText("Enter another integer:");
		//position of the text
		label2.setBounds(0, 30, 150, 150);
		//the color of the text
		label2.setForeground(Color.BLUE);
		
		//the output of the result
		label3 = new JLabel();
		label3.setText("Result: ");
		//position of the text
		label3.setBounds(60, 130, 150, 150);
		//the color of the text
		label3.setForeground(Color.BLACK);

		//will allow the user to put a number inside the box
		TF = new JTextField();
		TF.setBounds(110,43,150,20); 
		////will allow the user to put a number inside the box
		TF2 = new JTextField();
		TF2.setBounds(145,97,150,20);
		//will show the output of the 2 inputs
		TF3 = new JTextField();
		TF3.setBounds(115, 198, 150, 20);
        TF3.setEditable(false);   

	
        //will allow the user to add the given numbers
        addButton = new JButton("+");
        addButton.setFocusable(false);
		addButton.setBounds(30,140, 50, 30);
		addButton.addActionListener(this); 
		//will allow the user to subtract the given numbers
		subButton = new JButton("-");
		subButton.setFocusable(false);
		subButton.setBounds(100, 140, 50, 30);
		subButton.addActionListener(this); 
		//will allow the user to multiply 
		multiplyButton = new JButton("*");
		multiplyButton.setFocusable(false);
		multiplyButton.setBounds(170, 140, 50, 30);
		multiplyButton.addActionListener(this); 
		//will allow the user to multiply 
		divideButton = new JButton("/");
		divideButton.setFocusable(false);
		divideButton.setBounds(240, 140, 50, 30);
		divideButton.addActionListener(this); 
	

		JFrame frame = new JFrame();
		frame.setTitle("Basic calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setVisible(true);
		//adding the components in frame
		frame.add(label);
		frame.add(label2);
		frame.add(label3);
		frame.add(TF);
		frame.add(TF2);
		frame.add(TF3);
		frame.add(addButton);
		frame.add(subButton);
		frame.add(multiplyButton);
		frame.add(divideButton);
	}
	
	@Override
    public void actionPerformed(ActionEvent e)  {		
		String firstTextField = TF.getText();
		String secondTextField = TF2.getText();
		
		int toInteger = Integer.parseInt(firstTextField);
		int toInteger2 = Integer.parseInt(secondTextField);
		
		sum = toInteger + toInteger2;
		sub = toInteger - toInteger2;
		multi = toInteger * toInteger2;
		divide = toInteger / toInteger2;	
		
		result = String.valueOf(sum);  
	    result2 = String.valueOf(sub);
		result3 = String.valueOf(multi);
		result4 = String.valueOf(divide);
		

		if(e.getSource() == addButton) {
			TF3.setText(result);
		}
		
		else if(e.getSource() == subButton) {
			TF3.setText(result2);
		}
		
		else if(e.getSource() == multiplyButton) {
			TF3.setText(result3);
		}
		
		else {
			TF3.setText(result4);
		}

    }
	
}
