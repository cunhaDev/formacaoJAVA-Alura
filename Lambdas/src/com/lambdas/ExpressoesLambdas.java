package com.lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExpressoesLambdas {
	public static void main(String[] args) {
		/**
		 * Sintaxe das Expressoes Lambdas
		 * () -> { };
		 */
		
		//Sem Lambda
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ola Mundo");
			}
		});
		
		//Com Lambda
		JButton buttons = new JButton();
		buttons.addActionListener(e -> {
			System.out.println("Ola Mundo");
		});
	}
}
