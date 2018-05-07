package game;

import jplay.GameImage;
import jplay.Keyboard;
import jplay.Window;

public class GameOverMenu extends Scenario {

	private String nextScenario =  null; 
	
	public GameOverMenu(Window gameWindow, String name) {
		window = gameWindow;
		scenarioName = name;
		background = new GameImage("src//recursos//sprite//main_menu.png");
		initializeKeyboard();
	}
	
	protected void updateScenario() {
		
		while(nextScenario == null) {
			drawObjects();
			startGameAgain();
			window.update();
		}
	}
	
	protected void initializeKeyboard() {
		
		if(window != null) {
			sceneKeyboard = window.getKeyboard();
		} else {
			System.out.println("The keyboard needs a window to run. The window cannot be null");
		}
		sceneKeyboard.setBehavior(Keyboard.ENTER_KEY, Keyboard.DETECT_INITIAL_PRESS_ONLY);
	
	}
	
	public String runScenario() {
		
		updateScenario();
		System.out.println(nextScenario);
		return nextScenario;
		
	}
	
	private void startGameAgain() {
		
		if(sceneKeyboard.keyDown(Keyboard.ENTER_KEY)) {

				nextScenario = "StartMenu";
		}
	}
}
