package GUI;

import javax.swing.JFrame;

/**
 * 
 * @author Fred
 *	Classe principale qui va contenir tous les elements graphiques du jeu
 *	TODO : définir un layout pour disposer les divers elements
 */
public class Plateau extends JFrame {

	private Arene arene;
	
	public Plateau(){
		
	}

	public Arene getArene() {
		return arene;
	}

	public void setArene(Arene arene) {
		this.arene = arene;
	}
	
	

}
