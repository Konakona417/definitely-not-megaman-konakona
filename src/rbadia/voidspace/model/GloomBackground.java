package rbadia.voidspace.model;

import java.awt.Rectangle;

import rbadia.voidspace.main.GameScreen;

public class GloomBackground extends Rectangle {
	private static final long serialVersionUID = 1L;
	private GameScreen screen;
	//	public static final int DEFAULT_SPEED = 4;
	private int backgroundWidth = screen.getWidth();
	private int backgroundHeight = screen.getHeight();
//	private int platformX=0;
//	private int platformY=0;
	//	private int speed = DEFAULT_SPEED;

	/**
	 * Crates a new asteroid at a random x location at the top of the screen 
	 * @param screen the game screen
	 */
	public GloomBackground(GameScreen screen){
		this.setLocation(0 , 0);
		this.setSize(getBackgroundWidth(), getBackgroundHeight());
		
	}

	public int getBackgroundWidth() {
		return backgroundWidth;
	}
	public int getBackgroundHeight() {
		return backgroundHeight;
	}
}
