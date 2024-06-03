package Lab2;
/**
 * This class and its method is designed to 
 * help students practice "automated testing"
 * @author Marzieh Ahmadzadeh
 */ 
public class TestingExample {
	/**
	 * This method calculates the number of points a driver gets based on how far they have gone over the maximum allowed speed. 
	 * @param actualSpeed This parameter shows the current speed of the car that is caught by camera/police
	 * @param maxSpeed This parameter shows the maximum allowed speed in an area.  
	 * @param stuntDriving This parameter is true if a driver is caught in stunt driving. 
	 * @return
	 */
	public static int LicencePoints(int actualSpeed, int maxSpeed, boolean stuntDriving) { 
		int points = 0;
		if (actualSpeed < 0 || maxSpeed < 0) return -1;
		else if (actualSpeed - maxSpeed < 0) return -1;
		else if (stuntDriving || actualSpeed - maxSpeed >= 50) points = 6; 
		else if (actualSpeed - maxSpeed >= 30 && actualSpeed - maxSpeed <= 49) points = 4; 
		else if (actualSpeed - maxSpeed >= 16 && actualSpeed - maxSpeed <=29) points = 3;
		return points;

	}
}

