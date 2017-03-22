import java.util.Scanner;

public class HaverSine {
	public static final int Radius = 6371;
	
	public static void main(String args[]){
		
		double lat1 = Double.parseDouble(keyboard("lat1"));
		double lng1 = Double.parseDouble(keyboard("lat2"));
		double lat2 = Double.parseDouble(keyboard("lng1"));
		double lng2 = Double.parseDouble(keyboard("lng2"));
		
		final double dlng = Math.toRadians(lng1 - lng2);
		final double dlat = Math.toRadians(lat1 - lat2);
		final double a = Math.sin(dlat / 2) * Math.sin(dlat / 2) + Math.cos(Math.toRadians(lat2))
				* Math.cos(Math.toRadians(lat1)) * Math.sin(dlng / 2) * Math.sin(dlng / 2);
		final double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		System.out.println("distance: " + c * Radius);
	}
	private static String keyboard(String message) {
		System.out.print(message + ": ");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
}
