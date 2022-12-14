package game.entities;

public abstract class Obstacle extends Car {
    
	protected int area = 0;
	protected boolean visible = true;
	
	public Obstacle(String pathImage) {
		
		super(pathImage);
		
		generateRandomPosition();
	}
	
	protected void generateRandomPosition() {
		int x1 = (int)(Math.random()*16);
		x = 250 +x1*area;
		int y1 = (int)(Math.random()*1);
		y = y1*area-400;
	}

	protected void generateRandomPosition2() {
		int x1 = (int)(Math.random()*16);
		x = 340 +x1*area;
		int y1 = (int)(Math.random()*1);
		y = y1*area-600;
	}

	protected void generateRandomPosition3() {
		int x1 = (int)(Math.random()*16);
		x = 440 +x1*area;
		int y1 = (int)(Math.random()*1);
		y = y1*area-700;

	}

	protected void generateRandomPosition4() {
		// int x1 = (int)(Math.random()*16);
		// x = 500 +x1*area;
		int y1 = (int)(Math.random()*1);
		y = y1*area-500;

		x = 200 + (int) (Math.random() * (450 - 200));

	}

	// protected void generateRandomPosition() {
	// 	int x1 = (int)(Math.random()*16);
	// 	x = 200+x1*area;
	// 	int y1 = (int)(Math.random()*1);
	// 	y = y1*area-500;
	// }


	abstract public void move();
    
	public void setSpeed (int dy){
		this.dy = dy;
	}
	
	public void setVisible(boolean visible){
		this.visible = visible;
	}
	
	public boolean isVisible(){
		return visible;
	}
}
