package model;

public interface Game {

	public boolean isMoveOk(int x, int y, boolean isJumpOk);
	
	public boolean isPutOk(int x1, int y1, int x2, int y2, boolean isOk);

	public boolean move(int x, int y) ;
	
	public boolean put(int x1, int y1, int x2, int y2) ;

}
