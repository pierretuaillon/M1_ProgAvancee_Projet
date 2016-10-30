package Moteur;

import java.util.ArrayList;

import GUI.Arene;
import GUI.Plateau;
import Robot.Robot;

public class MoteurDeJeu {

	private ArrayList<Robot> ListeRobot = new  ArrayList<>();
	private Plateau PlateauDeJeu;
	/**
	 * Constructeur du Moteur de jeu prenant en paramétre le nombre de robot dans le jeu, la longueur du terrain et la largeur 
	 * @param nbRobot
	 * @param longeur
	 * @param largeur
	 */
	
	public MoteurDeJeu(int nbRobot, int longueur, int largeur){
		for(int i=0; i<nbRobot; i++){
			this.ListeRobot.add(new Robot(0, 0));
		}
		this.PlateauDeJeu = new Plateau();
		PlateauDeJeu.setArene(new Arene(longueur, largeur));
	}
	
	
	/**
	 * Methode pour lancer le jeu
	 */
	public void start(){
		
	}
	
	/**
	 * Méthode main
	 * @param args
	 */
	
	public static void main(String[] args) {
		MoteurDeJeu mdj = new MoteurDeJeu(2, 10, 10);
		mdj.start();
	}
}
