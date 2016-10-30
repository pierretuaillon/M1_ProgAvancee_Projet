package GUI;

import java.awt.GridLayout;
import java.awt.Panel;

/**
 * 
 * @author Fred
 *	Classe qui represente la zone graphique ou les robots s'affrontent. 
 */
public class Arene extends Panel{

	
	public Arene(int longueur , int largeur){
		GridLayout layout = new GridLayout(largeur, longueur);
		this.setLayout(layout);
	}

}
