package Robot;

/**
 * Class représentant un robot
 */

public class Robot {

	private int nombrePDV = 100;
	private int energie = 100;
	
	public IA ia;
	

	public Robot(IA ia){
		this.ia = ia;
	}
	
	
}
