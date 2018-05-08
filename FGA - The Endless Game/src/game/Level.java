package game;

import jplay.Window;

public abstract class Level extends Scenario {
	
	/**
	 * Esta classe � respons�vel por, somente, as fases do jogo.
	 * A sua diferen�a de scenario � que ela possui o m�todo de
	 * colis�o com todas as paredes do jogo.
	 */
	
	
	//Player
	protected Player playerInstance = null;
	
	
	//Metodos
	protected void addPlayer(int posX, int posY, String spritePath,  int spriteDivision, Window gameWindow){
		this.playerInstance = Player.getPlayerInstance(posX, posY, spritePath, spriteDivision, gameWindow);
	}
	
	protected void colissionWithPlayer() {}
	

}
