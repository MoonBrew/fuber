package fuber;

/**
 * Holds information regarding a customer request. Namely trip information and cab preferences.
 * @author jgeorge
 *
 */
public class CustomerRequest {
	private final Location start;
	private final Location end;
	private final Boolean pinkPreference;
	
	public CustomerRequest (Location start, Location end, Boolean pinkPreference ) {
		this.start = start;
		this.end = end;
		this.pinkPreference = pinkPreference;
	}

	/**
	 * @return the start
	 */
	public Location getStart() {
		return start;
	}

	/**
	 * @return the end
	 */
	public Location getEnd() {
		return end;
	}

	/**
	 * @return the pinkPreference
	 */
	public Boolean getPinkPreference() {
		return pinkPreference;
	}
	
}
