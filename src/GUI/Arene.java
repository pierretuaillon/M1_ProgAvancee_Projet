package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Robot.Robot;

/**
 * 
 * @author Fred
 *	Classe qui represente la zone graphique ou les robots s'affrontent. 
 */

public class Arene extends JPanel{

	
	public Arene(int longueur , int largeur){
		GridLayout layout = new GridLayout(largeur, longueur);
		this.setLayout(layout);
		this.setBackground(Color.WHITE);
		
		//DEBUG : affichage des cases 
		this.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		for (int i =0; i<(largeur*longueur); i++){
		    final JLabel label = new JLabel("");
		    label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		    this.add(label);
		}
	}
	
	public Arene(int longueur , int largeur, ArrayList<Robot> ListeRobot){
		GridLayout layout = new GridLayout(largeur, longueur);
		this.setLayout(layout);
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		
		for (int i =0; i<(largeur*longueur); i++){
		    JLabel label = new JLabel("");
		    
		    label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		    this.add(label);
		}
	}
	
	
}
