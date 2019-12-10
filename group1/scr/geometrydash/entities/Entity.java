package geometrydash.entities;
import java.awt.Graphics;
import java.awt.Rectangle;

import geometrydash.Handler;

public abstract class Entity {

	protected Handler handler;
	protected float x,y,spawnX,spawnY;
	protected int width,height;
	protected Rectangle bounds;
	
	public Entity(Handler handler,float x,float y,int width,int height) {
		
		this.handler=handler;
		spawnX=x;
		spawnY=y;
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		
		bounds=new Rectangle(8,8,width-16,height-16);
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}