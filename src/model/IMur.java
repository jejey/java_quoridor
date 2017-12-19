package model;

interface IMur {

	// indice de la colonne où est positionnée la premiere valeur du mur
	public int getX1();

	// indice de la ligne où est positionnée la premiere valeur du mur
	public int getY1();
	
	// indice de la colonne où est positionnée la seconde valeur du mur
	public int getX2();

	// indice de la ligne où est positionnée la seconde valeur du mur
	public int getY2();
	
	//verifie si l'on peut poser le mur aux coordonnées indiqués
	public boolean isPutOk(int x1, int x2, int y1,int y2, boolean isOk) ;
	
	//pose le mur
	public boolean put(int x1, int x2, int y1,int y2) ;
}