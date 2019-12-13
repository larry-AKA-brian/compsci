package geometrydash.tiles;

import java.awt.Polygon;
import java.awt.image.BufferedImage;

import geometrydash.gfx.Assets;

public abstract class SmallTile extends Tile{
	
	protected Polygon collisionBox;
	protected boolean isDeadly;
	
	public SmallTile(int id,BufferedImage img) {
		super(img, id);
	}

	public boolean isSolid() {
		return false;
	}
	
	public Polygon getCollisionBox(){
		return collisionBox;
	}

	public boolean isDeadly() {
		return isDeadly;
	}
	
	public boolean isSmallTile() {
		return true;
	}
	

}
