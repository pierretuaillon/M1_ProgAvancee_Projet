package Moteur;

import java.util.ArrayList;

import javax.swing.JFrame;

import GUI.Arene;
import GUI.Plateau;
import Robot.Robot;

public class MoteurDeJeu {

	private ArrayList<Robot> ListeRobot = new  ArrayList<>();
	private Plateau PlateauDeJeu;

	
	public static int nombreAleaLongueur(int max){
		return (int) (Math.random()*(max));
	}
	
	public static int nombreAleaLargeur(int max){
		return (int) (Math.random()*(max));
	}
	
	
	/**
	 * Méthode pour verifier qu'un robot ne se trouve pas au même coordonnée qu'un autre
	 * @param robot
	 * @return boolean
	 */
	public boolean robotExist(Robot robot){
		if (this.ListeRobot.isEmpty()){
			return false;
		}else{
			boolean exist = false;
			for (int i = 0; i < this.ListeRobot.size(); i++) {
				if((this.ListeRobot.get(i).getX() == robot.getX()) && (this.ListeRobot.get(i).getY() == robot.getY())){
					exist = true;
				}
			}
			return exist;
		}
	}
	
	/**
	 * Création du robot à des coordonnées aléatoire
	 * @return Robot
	 */
	public Robot creationRobot(){
		Robot robot = new Robot(MoteurDeJeu.nombreAleaLongueur(this.PlateauDeJeu.getArene().getLongueur()),
				MoteurDeJeu.nombreAleaLargeur(this.PlateauDeJeu.getArene().getLargeur()));
		while(robotExist(robot)){
			robot = new Robot(MoteurDeJeu.nombreAleaLongueur(this.PlateauDeJeu.getArene().getLongueur()),
					MoteurDeJeu.nombreAleaLargeur(this.PlateauDeJeu.getArene().getLargeur()));
		}
		return robot;
	}
	
	
	
	/**
	 * Constructeur du Moteur de jeu prenant en paramétre le nombre de robot dans le jeu, la longueur du terrain et la largeur 
	 * @param nbRobot
	 * @param longeur
	 * @param largeur
	 */
	
	public MoteurDeJeu(int nbRobot, int longueur, int largeur){
		//Creation du nombre de robots
		for(int i=0; i<nbRobot; i++){
			Robot robot = creationRobot();
			this.ListeRobot.add(robot);
		}
		this.PlateauDeJeu = new Plateau(new Arene(longueur, largeur));
		this.PlateauDeJeu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start();
	}
	
	
	/**
	 * Methode pour lancer le jeu
	 */
	public void start(){
		
		//Tant qu'il reste plus d'un robot en jeu
		while(this.ListeRobot.size()>1){
			//On parcours la liste des robots et on leurs demande leurs actions 
			for (int i = 0; i < this.ListeRobot.size(); i++) {
				this.ListeRobot.get(i).getAction();
			}
		}
		
		System.out.println("Le gagnant est : " + this.ListeRobot.get(0));
		
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
