package game;

public abstract class Level extends Scenario {
	
	/**
	 * Esta classe � respons�vel por, somente, as fases do jogo.
	 * A sua diferen�a de scenario � que ela possui o m�todo de
	 * colis�o com todas as paredes do jogo.
	 */
	
	
	//Player
	protected Player gamer = null;
	
	
	//Metodos
	protected void colissionWithPlayer() {}
	

}
