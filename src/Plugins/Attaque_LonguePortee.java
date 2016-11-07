package Plugins;

import java.util.ArrayList;

import Robot.Robot;

public class Attaque_LonguePortee implements Plugin_Attaque {
	
	private int puissanceAttaque = 1;
	private int nbEnergieConsommee = 2;
	
	private int portee = 5;
	
	@Override
	public void attaquerRobot(ArrayList<Robot> listeRobot, int indexRobotAttaquant, int indexRobotCible) {

		Robot robotAttaquant = listeRobot.get(indexRobotAttaquant);
		Robot robotCible = listeRobot.get(indexRobotCible);
		
		robotAttaquant.setEnergie(robotAttaquant.getEnergie() - this.nbEnergieConsommee);
		robotCible.setNombrePDV(robotCible.getNombrePDV() - this.puissanceAttaque);
		
		if (robotCible.getNombrePDV() == 0) {
			listeRobot.remove(indexRobotCible);
		}
		
	}

	public int getPortee() {
		return portee;
	}
	
}
