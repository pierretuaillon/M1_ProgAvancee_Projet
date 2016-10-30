package GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Fred
 *	Classe qui represente la zone graphique ou les robots s'affrontent. 
 */
public class Arene extends JPanel{

	
	public Arene(int longueur , int largeur){
		GridLayout layout = new GridLayout(largeur, longueur);
		this.setLayout(layout);
		this.setBackground(Color.GRAY);
		
		//DEBUG : affichage des cases 
		this.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		for (int i =0; i<(largeur*longueur); i++){
		    final JLabel label = new JLabel("");
		    label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		    this.add(label);
		}
	}

}
