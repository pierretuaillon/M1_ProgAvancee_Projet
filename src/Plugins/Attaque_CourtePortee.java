package Plugins;

import java.util.ArrayList;

import Robot.Robot;

public class Attaque_CourtePortee implements Plugin_Attaque {
	
	private int puissanceAttaque = 2;
	private int nbEnergieConsommee = 2;
	
	private int portee = 2;
	
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
