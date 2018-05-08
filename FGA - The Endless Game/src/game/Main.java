package game;

import jplay.Window;

public class Main {

	public static void main(String[] args){
		Window gameWindow = new Window(800, 600);
		LevelStateMachine levelStateMachine = new LevelStateMachine();

		MainMenu startMenu = new MainMenu(gameWindow, "StartMenu");
		Encerrar finishScene = new Encerrar(gameWindow, "FinishScene");
		Introduction introScene = new Introduction(gameWindow, "IntroductionScene");
		Battle battle = new Battle(gameWindow, "BattleScene");
		Question question = new Question(gameWindow, "QuestionScene");
		Level1 level1 = new Level1(gameWindow, "Level1");

		levelStateMachine.addScenario(startMenu);
		levelStateMachine.addScenario(finishScene);
		levelStateMachine.addScenario(introScene);
		levelStateMachine.addScenario(battle);
		levelStateMachine.addScenario(question);
		levelStateMachine.addScenario(level1);

		levelStateMachine.run("Level1");

	}

}
