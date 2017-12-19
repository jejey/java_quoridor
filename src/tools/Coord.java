package tools;

public class Coord {
	
	public static boolean valider(int x, int y){
		return ( (x<=9) && (x>=0) && (y<=9) && (y>=0) );
	}
}
