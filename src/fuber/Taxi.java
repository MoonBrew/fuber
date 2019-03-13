package fuber;

/**
 * Represents a cab, its location, characteristics and status. Can drive from one location to another
 * @author jgeorge
 *
 */
public class Taxi {
	/**
	 * Shows the current location.
	 */
	private Location currentLocation;

	private final Boolean isPink;

	private TaxiStatus status;
	public enum TaxiStatus{
		WAITING,
		ONTRIP
	}
	
	public Taxi (Location startingLocation, Boolean isPink) {
		this.currentLocation = startingLocation;
		this.isPink = isPink;
		this.status = TaxiStatus.WAITING;
	}
	
	public void drive(CustomerRequest customerRequest) {
		//TODO
		//Set status to ONTRIP
		//Drive to customerRequest.start
		//Drive to customerRequest.end
		//Set status to WAITING
		
		status = TaxiStatus.ONTRIP;
		//drive start
		//drive end
		status = TaxiStatus.WAITING;
		
		//Driving means waiting Distance/speed.
		//Update currentLocation each tick(second).
		//It is asynchronous.
		
	}
	
	/**
	 * @return the currentLocation
	 */
	public Location getCurrentLocation() {
		return currentLocation;
	}
	
	/**
	 * @return the isPink
	 */
	public Boolean getIsPink() {
		return isPink;
	}
	
	public Boolean isAvailable() {
		return status == TaxiStatus.WAITING;
	}
}
