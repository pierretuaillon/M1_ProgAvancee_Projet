package Robot;

/**
 * Class représentant un robot
 */

public class Robot {

	/*
	 *Position en X et en Y sur la grille du robot 
	 */
	private int x;
	private int y;
	
	private int nombrePDV = 10;
	private int energie = 10;
	
	public Robot(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void getAction(){
		try {
			Class.forName("Plugins.Plugin_Deplacement");
		} catch (ClassNotFoundException e) {
			System.out.println("Plugin non trouvé");
			e.printStackTrace();
		}
	}
}
