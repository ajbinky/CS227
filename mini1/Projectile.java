package mini1;

import java.awt.Rectangle;

/**
 * Creates a Projectile object
 * @author Andrew Behncke
 */
public class Projectile {
	
	// Private variables
	private double x;
	private double y;
	private double velX;
	private double velY;
	private int age;
	private int size;
	private boolean isAlive;
	
	
	// Constructor
	public Projectile(double inInitX, double inInitY, double inInitVelX, double inInitVelY, int inSize) {
		x = inInitX;
		y = inInitY;
		velX = inInitVelX;
		velY = inInitVelY;
		size = inSize;
		isAlive = true;
		age = 0;
	}
	
	// Methods
	public boolean collides(Projectile other) {
		
		if (getBoundingBox().intersects(other.getBoundingBox())) {
			return true;
		} else {
			return false;
		}

	}
	
	public int getAge() {
		
		return age;
	}
	
	public Rectangle getBoundingBox() {
		
		int intX = (int) Math.round(x);
		int intY = (int) Math.round(y);
		
		return new Rectangle(intX, intY, size, size);
	}
	
	public double getVelocityX() {
		
		return velX;
	}
	
	public double getVelocityY() {
		
		return velY;
	}
	
	public double getX() {
		
		return x;
	}
	
	public double getY() {
		
		return y;
	}
	
	public boolean isAlive() {
		
		return isAlive;
	}
	
	public void kill() {
		
		isAlive = false;
	}
	
	public void timeStep() {
		
		x += velX;
		y += velY;
		age++;
		
	}
	
	public void timeStep(double gravity) {
		
		x += velX;
		y += velY;
		velY += gravity;
		age++;
		
	}
	
}
