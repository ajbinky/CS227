package hw1;

/**
 * Class for calculating information for other classes
 * @author Andrew Behncke
 */
public class TicketUtil {
	
	/**
	 * Non discounted ride cost
	 */
	public static final int RIDE_COST = 200;
	/**
	 * Discounted ride cost
	 */
	public static final int RIDE_COST_DISCOUNTED = 150;
	/**
	 * Additional cost per zone traveled
	 */
	public static final int ZONE_COST = 175;
	/**
	 * Additional cost per zone traveled with discount
	 */
	public static final int ZONE_COST_DISCOUNTED = 120;
	/**
	 * Placeholder zone value
	 */
	public static final int INVALID_ZONE = -1;

	/**
	 * Shouldn't be used, if I understand this correctly. Marked private so that it causes error.
	 */
	private TicketUtil() {
		
	}
	
	/**
	 * Calculates the cost of a ride with the given information
	 * @param startZone
	 * 		Zone that ride starts in
	 * @param endZone
	 * 		Zone that ride ends in
	 * @param discounted
	 * 		Is the cost of this ride discounted
	 * @return
	 * 		Cost of single ride
	 */
	public static int calculateRideCost(int startZone, int endZone, boolean discounted) {
		if (discounted) {
			return RIDE_COST_DISCOUNTED + (ZONE_COST_DISCOUNTED * Math.abs(startZone - endZone));
		}
		return RIDE_COST + (ZONE_COST * Math.abs(startZone - endZone));
	}
	
	/**
	 * Calculates the cost of a ride with the given information
	 * @param numRides
	 * 		Number of rides
	 * @param startZone
	 * 		Zone that ride starts in
	 * @param endZone
	 * 		Zone that ride ends in
	 * @param discounted
	 * 		Is the cost of this ride discounted
	 * @return
	 * 		Cost of multiple rides
	 */
	public static int calculateRideCost(int numRides, int startZone, int endZone, boolean discounted) {
		if (discounted) {
			return (RIDE_COST_DISCOUNTED + (ZONE_COST_DISCOUNTED * Math.abs(startZone - endZone))) * numRides;
		}
		return (RIDE_COST + (ZONE_COST * Math.abs(startZone - endZone))) * numRides;
	}
	
	/**
	 * Returns the minimum cost of a ride
	 * @param discounted
	 * @return
	 * 		Minimum cost of a ride
	 */
	public static int getMinimumFare(boolean discounted) {
		if (discounted) {
			return RIDE_COST_DISCOUNTED;
		}
		return RIDE_COST;
	}
	
}