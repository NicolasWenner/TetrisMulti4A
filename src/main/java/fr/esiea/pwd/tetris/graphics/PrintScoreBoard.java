package fr.esiea.pwd.tetris.graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

public class PrintScoreBoard extends JPanel {
	
	public PrintScoreBoard () {
		
		JLabel title = new JLabel ("Scores");
		this.setPreferredSize(new Dimension(300,300));
		this.setMaximumSize(new Dimension(300,300));
		this.setMinimumSize(new Dimension(200,200));
		this.setVisible(true);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		this.add(title);
	}

}
