package model;

import java.util.List;

public class Jeu implements Game {

	private List<Mur> MurPoses;
	private int nbMur = 10;
	private Pion pion;
	private Couleur couleur;

	public Jeu(Couleur couleur, int x, int y) {
		this.couleur = couleur;
		this.pion = new Pion(x, y, couleur);
	}

	@Override
	public boolean isMoveOk(int x, int y, boolean isJumpOk) {
		boolean valid = pion.isMoveOk(x, y, isJumpOk);
		if (valid || isJumpOk)
			return true;
		return false;
	}

	@Override
	public boolean isPutOk(int x1, int y1, int x2, int y2, boolean isOk) {
		Mur mur = new Mur();
		boolean valid = mur.isPutOk(x1, x2, y1, y2, isOk);
		if (valid && isOk && MurPoses.size() < nbMur)
			return true;
		return false;
	}

	@Override
	public boolean move(int x, int y) {
		pion.move(x, y);
		return true;
	}

	@Override
	public boolean put(int x1, int y1, int x2, int y2) {
		Mur mur = new Mur();
		mur.put(x1, x2, y1, y2);
		MurPoses.add(mur);
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!"); // Display the string.
		Jeu jeu = new Jeu(Couleur.ORANGE, 5, 0);
		if (jeu.isMoveOk(5, -1, false)) {
			jeu.move(5, -1);
			System.out.println("Le pion bouge");
		}
		if (jeu.isPutOk(0, 1, 2, 3, true)) {
			jeu.put(0,1, 2, 3);
			System.out.println("Le mur est posé");
		}
	}

}
