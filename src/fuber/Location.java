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
	private double longitude;
	/**
	 * The Distance on the X-axis.
	 */
	private double latitude;
	
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

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
}
