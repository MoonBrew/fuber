package fuber;

import java.util.Collection;

/**
 * The taxi cab hailing service.
 * @author jgeorge
 *
 */
public class Fuber {
	private Collection<Taxi> fleet;
	
	public Fuber (Collection<Taxi> fleet) {
		this.fleet = fleet;
	}
	
	public Boolean resolveRequest(CustomerRequest customerRequest) {
		//TODO
		//Get available cabs based on customer prefs.
		//Find closest one.
		//Assign request.
		return true;
	}
}
