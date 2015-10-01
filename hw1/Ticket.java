package hw1;

/**
 * Ticket that can be created by TicketMachine, and used at Turnstile
 * @author Andrew Behncke
 */
public class Ticket {

	/**
	 * If in transit, this is the zone that the trip started in, else, its INVALID_ZONE
	 */
	private int startZone;
	/**
	 * Are rides with this Ticket discounted?
	 */
	private boolean discount;
	/**
	 * Current balance on the Ticket
	 */
	private int balance;
	/**
	 * Is this Ticket currently on a ride?
	 */
	private boolean isInTransit;
	
	/**
	 * Creates a new Ticket with given values
	 * @param value
	 * 		Initial balance on the Ticket
	 * @param discounted
	 * 		Does this Ticket have discounted rides?
	 */
	public Ticket(int value, boolean discounted) {
		discount = discounted;
		balance = value;
		startZone = TicketUtil.INVALID_ZONE;
		isInTransit = false;
	}
	
	/**
	 * Changes this Ticket to being on a ride with the specified zone
	 * @param zone
	 * 		Starting zone of the trip
	 */
	public void beginTrip(int zone) {
		startZone = zone;
		isInTransit = true;
	}
	
	/**
	 * Returns starting zone
	 * @return
	 * 		Starting zone of current ride
	 */
	public int getStartZone() {
		
		return startZone;
	}
	
	/**
	 * Returns whether or not this Ticket gets discounted rides
	 * @return
	 * 		whether or not this Ticket gets discounted rides
	 */
	public boolean isDiscounted() {
		
		return discount;
	}
	
	/**
	 * Returns Ticket's current balance
	 * @return
	 * 		This Ticket's current balance
	 */
	public int getBalance() {
		
		return balance;
	}
	
	/**
	 * If the Ticket's balance has enough, returns true, changes balance, and changes inTransit boolean
	 * @param rideCost
	 * 		Cost of the ride
	 * @return
	 * 		true if balance has enough
	 */
	public boolean charge(int rideCost) {
		isInTransit = false;
		startZone = TicketUtil.INVALID_ZONE;
		if (rideCost > balance) {
			return false;
		}
		balance -= rideCost;
		return true;
	}
	
	/**
	 * Returns whether or not the Ticket is currently on a ride
	 * @return
	 * 		true if Ticket is on a ride
	 */
	public boolean isInTransit() {
		
		return isInTransit;
	}
	
}