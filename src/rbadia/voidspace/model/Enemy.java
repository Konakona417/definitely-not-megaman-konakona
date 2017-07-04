package rbadia.voidspace.model;

import java.awt.Rectangle;

import rbadia.voidspace.main.GameScreen;

public class Enemy extends Rectangle {
	private static final long serialVersionUID = 1L;

	//	public static final int DEFAULT_SPEED = 4;
	private int enemyWidth = 32;
	private int enemyHeight = 32;
	private static final int Y_OFFSET = 325;
//	private int platformX=0;
//	private int platformY=0;
	//	private int speed = DEFAULT_SPEED;

	public Enemy(GameScreen screen){
		this.setLocation((screen.getWidth() - enemyWidth)/2,
				screen.getHeight() - enemyHeight - Y_OFFSET);
		this.setSize(enemyWidth, enemyHeight);
	}

	public int getEnemyWidth() {
		return enemyWidth;
	}
	public int getEnemyHeight() {
		return enemyHeight;
	}
}
