package tools;

public class Coord {

	public static boolean valider(int x, int y) {
		if ((x <= 9) && (x >= 0) && (y <= 9) && (y >= 0))
		{
			System.out.println("true y=" + y);
			return true;
		}
			
		return false;
	
	}}
	
