package model;

import tools.Coord;

public class Mur implements IMur {

	private int x1, x2, y1, y2;
	
	public Mur(){
		this.x1 = -1;
		this.x2 = -1;
		this.y1 = -1;
		this.y2 = -1;
	}
	
	@Override
	public int getX1() {
		return x1;
	}

	@Override
	public int getY1() {
		return y1;
	}

	@Override
	public int getX2() {
		return x2;
	}

	@Override
	public int getY2() {
		return y2;
	}

	@Override
	public boolean isPutOk(int x1, int x2, int y1, int y2, boolean isOk) {
		
		boolean ret = false;
		
		if (Coord.valider(x1, y1) && Coord.valider(x2, y2)) {
			
			//verifie que le mur fait la bonne taille et est vertical
			if (x1==x2 && Math.abs(y2-y1)==2 && isOk)
				ret = true;
			
			//verifie que le mur fait la bonne taille et est horizontal
			if (y1==y2 && Math.abs(x1-x2)==2 && isOk)
				ret = true;
			
			//verifie si le mur n'est pas collé au bord du plateau (c'est interdit)
			if ((x1==x2 && (x1==0 || x1==9)) || (y1==y2 && (y1==0 || y1==9)))
				ret = false;
		}
		return ret;
	}

	@Override
	public boolean put(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		return true;
	}

}
