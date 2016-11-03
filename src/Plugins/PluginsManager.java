package Plugins;

/**
 * 
 * @author Admin
 *	Design pattern singleton
 *	Chargement des plugins via cette classe.
 */
public class PluginsManager {

	private PluginsManager instance;
	
	private PluginsManager() {
		// TODO Auto-generated constructor stub
	}
	
	public PluginsManager getInstance(){
		if (instance != null)
			return instance;
		return new PluginsManager();			
	}

}
