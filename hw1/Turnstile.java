package hw1;

/**
 * Turnstile for processing Tickets
 * @author Andrew Behncke
 */
public class Turnstile {

	/**
	 * The zone that the turnstile is located
	 */
	private int myZone;
	/**
	 * Total number of Tickets swiped to get on
	 */
	private int swipedIn;
	/**
	 * Total number of Tickets swiped to get off
	 */
	private int swipedOut;

	/**
	 * Constructs a new Turnstile
	 * @param zone
	 * 		The zone of the Turnstile
	 */
	public Turnstile(int zone) {
		myZone = zone;
	}
	
	/**
	 * If the Ticket wasn't swiped out, it tries to do so. Then if it has sufficient balance, it swipes in and changes the Ticket accordingly.
	 * @param ticket
	 * 		Ticket being swiped at Turnstile
	 * @return
	 * 		true if balance is enough to cover last trip if needed, and this trip.
	 */
	public boolean swipeIn(Ticket ticket) {
		// I feel like this should be done more efficiently, like just calling swipeOut(ticket) or something like that, but it works, so whatever.
		if (ticket.isInTransit()) {
			if (ticket.getBalance() < TicketUtil.calculateRideCost(ticket.getStartZone(), myZone, ticket.isDiscounted())) {
				return false;
			} else {
				ticket.charge(TicketUtil.calculateRideCost(ticket.getStartZone(), myZone, ticket.isDiscounted()));
				swipedOut++;
			}
		}
		if (ticket.getBalance() < TicketUtil.getMinimumFare(ticket.isDiscounted())) {
			return false;
		}
		ticket.beginTrip(myZone);
		swipedIn++;
		return true;
	}
	
	/**
	 * If the ticket wasn't swiped in, or has sufficient balance, it returns false. Otherwise it returns true and changes the Ticket accordingly.
	 * @param ticket
	 * 		Ticket being swiped at Turnstile
	 * @return
	 * 		true if balance is enough to cover trip
	 */
	public boolean swipeOut(Ticket ticket) {
		if ((!ticket.isInTransit()) || (ticket.getBalance() < TicketUtil.calculateRideCost(ticket.getStartZone(), myZone, ticket.isDiscounted()))) {
			return false;
		}
		ticket.charge(TicketUtil.calculateRideCost(ticket.getStartZone(), myZone, ticket.isDiscounted()));
		swipedOut++;
		return true;
	}
	
	/**
	 * Returns the total number of Tickets swiped in
	 * @return
	 * 		Total Tickets swiped in
	 */
	public int getEntranceCount() {
		
		return swipedIn;
	}
	
	/**
	 * Returns the total number of Tickets swiped out
	 * @return
	 * 		Total Tickets swiped out
	 */
	public int getExitCount() {
		
		return swipedOut;
	}
	
}