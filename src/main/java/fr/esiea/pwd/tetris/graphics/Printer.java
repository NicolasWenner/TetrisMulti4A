package fr.esiea.pwd.tetris.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Printer extends JFrame {

	public void PrintBoard(){
		JLabel title = new JLabel("Game Area");
		title.setForeground(Color.white);
		this.setPreferredSize(new Dimension(700,300));
		this.setMaximumSize(new Dimension(600,300));
		this.setMinimumSize(new Dimension(500,200));
		this.setVisible(true);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(title);
		this.setBackground(Color.DARK_GRAY);
	}
	
	public void PrintScoreBoard() {
		
		JLabel title = new JLabel ("Scores");
		this.setPreferredSize(new Dimension(300,300));
		this.setMaximumSize(new Dimension(300,300));
		this.setMinimumSize(new Dimension(200,200));
		this.setVisible(true);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		this.add(title);
	}
	
	public void PrintWindow() {
		
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
