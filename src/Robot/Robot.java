package Robot;

import java.awt.Color;

/**
 * Class représentant un robot
 */

public class Robot {

	/*
	 *Position en X et en Y sur la grille du robot 
	 */
	private int x;
	private int y;
	private Color color;
	
	private int nombrePDV = 10;
	private int energie = 10;
	
	public Robot(int x, int y){
		this.x = x;
		this.y = y;
		this.SetCouleur();
	}
	
	
	//The Color constructor will also take integers in the range of 0 to 255. Like 0.0 to 1.0, 0 is as little of a color as possible and 255 is 100% of a color. So we can also create 3 random ints in that range for our colors.

	public void SetCouleur(){
		int r = (int) Math.round(Math.random() * 255);
		int g = (int) Math.round(Math.random() * 255);
		int b = (int) Math.round(Math.random() * 255);
		 
		this.color = new Color(r, g, b);
	}
	
	
	
	
	public void getAction(){
		try {
			Class.forName("Plugins.Plugin_Deplacement");
		} catch (ClassNotFoundException e) {
			System.out.println("Plugin non trouvé");
			e.printStackTrace();
		}
	}
	
	
	
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	@Override
	public String toString() {
		return "Robot [color=" + color + ", nombrePDV=" + nombrePDV + ", energie=" + energie + "]";
	}

	
}
