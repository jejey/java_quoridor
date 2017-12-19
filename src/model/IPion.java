package model;

public interface IPion {
	
	// indice de la colonne où est positionnée la piece
	public int getX();
	
	// indice de la ligne où est positionnée la piece
	public int getY();
	
	//couleur du pion
	public Couleur getCouleur();
	
	//verifie si le pion peut se deplacer aux coordonnées indiqués
	public boolean isMoveOk(int xFinal, int yFinal, boolean isJumpOk) ;
	
	//deplace le pion
	public boolean move(int xFinal, int yFinal) ;

}
