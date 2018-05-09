package game;

import jplay.GameImage;
import jplay.Window;

public class Level1 extends Level {

	GameImage backGround = new GameImage("src//recursos//tiles//background_default.png");
	private NPC npc;
	private Scenario cena;
	private GameObject parede;
	public Level1(Window gameWindow, String name){

		this.window = gameWindow;
		this.scenarioName = name;
		addPlayer(640, 350, "src//recursos//sprite//jogador2.png", 20, window);
		npc = new NPC(300,300);
		SoundPlayer.play("doido.mid");
		parede = new GameObject(600,300, "src//recursos//tiles//wallextended.png", 1, GameObjectType.WALL);
		this.addSceneObjects(parede);
	}

	@Override
	public String runScenario(){

		initializeKeyboard();
		this.drawLevel();
		return "NEXT_LEVEL";

	}

	private void drawLevel() {
		while(true){

			backGround.draw();
			playerInstance.draw();
			npc.draw();
			parede.draw();
			
			
			playerInstance.setCollisionType(this.playerCollision());
			npc.perseguir(playerInstance.x, playerInstance.y);
			//player.caminho(cena , parede);
			npc.caminho(cena,parede);
			playerInstance.move(window);
			
			parede.update();
			window.update();

		}
	}
}
