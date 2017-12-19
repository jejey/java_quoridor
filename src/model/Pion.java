package model;

import tools.Coord;

public class Pion implements IPion {

	private int x, y;
	private Couleur couleur;
	
	public Pion(int x,int y, Couleur couleur) {
		this.x = x;
		this.y = y;
		this.couleur = couleur;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public Couleur getCouleur() {
		return couleur;
	}

	@Override
	public boolean isMoveOk(int x, int y, boolean isJumpOk) {
		if (Coord.valider(x, y)){
			if(!isJumpOk)
				return false;
			
			return true;
		}
			
		return false;
	}

	@Override
	public boolean move(int x, int y) {
		this.x = x;
		this.y = y;
		return true;
	}

}
