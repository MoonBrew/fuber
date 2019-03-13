package fuber;

/**
 * Holds a location value.
 * @author jgeorge
 *
 */
public class Location {
	/**
	 * The Distance on the Y-axis.
	 */
	private final double longitude;
	/**
	 * The Distance on the X-axis.
	 */
	private final double latitude;
	
	public Location (double aLongitude, double aLatitude) {
		this.longitude = aLongitude;
		this.latitude = aLatitude;
	}
	
	/**
	 * Get distance using pythagoras theorem on x/y axis.
	 * @param a A location.
	 * @param b A second location
	 * @return The distance
	 */
	public static double getDistance(Location a, Location b) {
		return Math.sqrt(Math.pow(a.longitude - b.longitude, 2) + Math.pow(a.latitude - b.latitude, 2));
	}
}
