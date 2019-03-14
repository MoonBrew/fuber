package fuber;

/**
 * Represents a cab, its location, characteristics and status. Can drive from one location to another
 * @author jgeorge
 *
 */
public class Taxi extends Thread {
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
	/**
	 * There needs to be a speed constant for all taxis. Assuming is same for simplicity.
	 * The speed is in units per second.
	 */
	public final static double SPEED = 0.1;
	
	public Taxi (Location startingLocation, Boolean isPink) {
		this.currentLocation = startingLocation;
		this.isPink = isPink;
		this.status = TaxiStatus.WAITING;
	}
	
	public void drive(CustomerRequest customerRequest) {
		//Set status to ONTRIP
		//Drive to customerRequest.start
		//Drive to customerRequest.end
		//Set status to WAITING
		status = TaxiStatus.ONTRIP;
		driveLogic(currentLocation, customerRequest.getStart());
		driveLogic(currentLocation, customerRequest.getEnd());
		status = TaxiStatus.WAITING;
	}
	
	private void driveLogic(Location from, Location to) {
		//Driving means waiting Distance/speed.
		//Update currentLocation each tick(second).
		//It is asynchronous. (Each taxi is a separate thread)
		double distance = Location.getDistance(from, to);
		double time = distance/SPEED * 1000;
		double xMovementPerTick = (to.getLatitude() - from.getLatitude()) * SPEED / distance;
		double yMovementPerTick = (to.getLongitude() - from.getLongitude()) * SPEED / distance;
		while(time > 0) {
			try {
				if(time < 1000) {
					Thread.sleep((long) time);//cast instead of round (better to make up some time lost during calculations)
					currentLocation.setLatitude(to.getLatitude());
					currentLocation.setLongitude(to.getLongitude());
					time = 0;
				}
				Thread.sleep(1000);
				time = time - 1000;
				currentLocation.setLatitude(from.getLatitude() + xMovementPerTick);
				currentLocation.setLongitude(from.getLongitude() + yMovementPerTick);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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
