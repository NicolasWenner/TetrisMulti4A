package fr.esiea.pwd.tetris.graphics;

import java.awt.Color;
import java.awt.*;
import java.awt.Dimension;

import javax.swing.*;

import fr.esiea.pwd.tetris.board.CreateBoard;

public class PrintBoard extends JPanel {
	
	public PrintBoard () {
		
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
	

}
