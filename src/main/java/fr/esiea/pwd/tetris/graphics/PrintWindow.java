package fr.esiea.pwd.tetris.graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.*;


public  class PrintWindow extends JFrame {
	
	public  PrintWindow() {
	
	PrintScoreBoard scorePanel = new PrintScoreBoard();
	PrintBoard gameBoard = new PrintBoard();
	
	this.setSize(1000,700);
	this.setVisible(true);
	this.setTitle("Play a fun game of Tetris");
	this.setLayout(new BorderLayout());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setLocationRelativeTo(null);
    

	//this.getContentPane().setBackground(Color.BLACK);
	
	this.getContentPane().add(gameBoard,BorderLayout.WEST);
	this.getContentPane().add(scorePanel,BorderLayout.EAST);
	
	
	
		
	}

}
