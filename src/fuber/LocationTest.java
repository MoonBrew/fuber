package fuber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LocationTest {

	@Test
	void testGetDistance() {
		//3,4,5
		assertEquals(5, Location.getDistance(new Location(10, 10), new Location(7, 6)));
		
		//Negative
		assertEquals(5, Location.getDistance(new Location(-10, -10), new Location(-7, -6)));
		
		//Reversed
		assertEquals(5, Location.getDistance(new Location(-7, -6), new Location(-10, -10)));
		
		//Same as above but with real numbers
		assertEquals(5, Location.getDistance(new Location(10, 10), new Location(5.41742, 8.00001)), 0.00001);
		
		//Negative
		assertEquals(5, Location.getDistance(new Location(-10, -10), new Location(-5.41742, -8.00001)), 0.00001);
		
		//Reversed
		assertEquals(5, Location.getDistance(new Location(-5.41742, -8.00001), new Location(-10, -10)), 0.00001);
	}
}
