package model;

import tools.Coord;

public class Pion implements IPion {

	private int x, y;
	private Couleur couleur;

	public Pion(int x, int y, Couleur couleur) {
		if(Coord.valider(x, y))
		{
			this.x = x;
			this.y = y;
		}
		this.x = 0;
		this.y = 5;
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
	public boolean isMoveOk(int xf, int yf, boolean isJumpOk) {
		boolean ret = false;
		if (Coord.valider(xf, yf)) {
			if (isJumpOk || Math.abs(xf - this.x) + Math.abs(yf - this.y) == 1)
				ret = true;
		}
		return ret;
	}

	@Override
	public boolean move(int x, int y) {
		this.x = x;
		this.y = y;
		return true;
	}

}
