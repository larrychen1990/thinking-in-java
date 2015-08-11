package com.hawk.c01.custom.regex;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegularExpressionTester {

	public static void main(String[] args) {

		final JTextField patternField = new JTextField(12);

		final JTextField testField = new JTextField(12);
		final JTextField testField2 = new JTextField(12);

		patternField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String pattern = patternField.getText();

				try {
					Pattern.compile(pattern);
					patternField.setBackground(Color.GREEN);
				} catch (PatternSyntaxException exception) {
					patternField.setBackground(Color.RED);
				}
			}
		});

		testField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String pattern = patternField.getText();
				String string = testField.getText();

				// Check if input matches regex String
				if (string.matches(pattern)) {
					testField.setBackground(Color.GREEN);
				} else {
					testField.setBackground(Color.RED);
				}
			}
		});
		
		testField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String pattern = patternField.getText();
				String string = testField2.getText();
				
				// Check if input matches regex String
				if (string.matches(pattern)) {
					testField2.setBackground(Color.GREEN);
				} else {
					testField2.setBackground(Color.RED);
				}
			}
		});

		final JFrame frame = new JFrame("Regular Expression Tester");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(1);
			}
		});

		Container contentPane = frame.getContentPane();

		contentPane.setLayout(new GridLayout(3, 2, 0, 0));
		contentPane.add(new JLabel("Pattern "));
		contentPane.add(patternField);
		contentPane.add(new JLabel("Test String "));
		contentPane.add(testField);
		contentPane.add(new JLabel("Test String 2"));
		contentPane.add(testField2);
		frame.pack();
		frame.show();
	}
}
