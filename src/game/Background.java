package game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import game.tools.ImageLoader;

public class Background {

	private static final int LEFT_ROAD_BOUND = 150;
	private static final int RIGHT_ROAD_BOUND = 570;
	private static final int TOP_ROAD_BOUND = 0;
	private static final int DOWN_ROAD_BOUND = 590;

	private BufferedImage road, road2, backRoad, backroad2, backroad3, end1;
	private int roadX, roadY, backRoadX, backRoadY;
	private int dy;

	public Background() {
		roadX = 160;
		roadY = 1640;
		backRoadX = 100;
		backRoadY = -1000;

		road = ImageLoader.loadImage("/res/(long)portraitRoadBG.png");
		road2 = ImageLoader.loadImage("/res/(long)portraitRoadBGa.png");
		backRoad = ImageLoader.loadImage("/res/(long)background.png");
		backroad2 = ImageLoader.loadImage("/res/(long)backgrounda.png");
		backroad3 = ImageLoader.loadImage("/res/(long)backgroundb.png");
		end1 = ImageLoader.loadImage("/res/end.jpg");
	}

	public int getRoadX() {
		return roadX;
	}

	public int getRoadY() {
		return roadY;
	}

	public int geBackRoadX() {
		return backRoadX;
	}

	public int getBackRoadY() {
		return backRoadY;
	}

	public Image getRoad() {
		return road;
	}

	public Image getRoadA() {
		return road2;
	}

	public Image getBackRoad() {
		return backRoad;
	}

	public Image getBackRoad2() {
		return backroad2;
	}

	public Image getBackRoad3() {
		return backroad3;
	}

	public Image getEnd() {
		return end1;
	}

	public void update() {
		roadY += dy;
		if (roadY > 0) {
			roadY = -3340;
			backRoadY += dy;
			backRoadY += dy;

		}

	}

	public void setSpeed(int dy) {
		this.dy = dy;
		update();
	}

	public int getLeftRoadBound() {
		return LEFT_ROAD_BOUND;
	}

	public int getRightRoadBound() {
		return RIGHT_ROAD_BOUND;
	}

	public int getTopRoadBound() {
		return TOP_ROAD_BOUND;
	}

	public int getDownRoadBound() {
		return DOWN_ROAD_BOUND;
	}

}