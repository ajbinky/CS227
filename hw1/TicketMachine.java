package hw1;

public class TicketMachine {

	/**
	 * Total number of tickets created
	 */
	private int totalTickets;
	/**
	 * Total amount of money collected from Tickets being purchased
	 */
	private int totalCost;

	/**
	 * Creates a new TicketMachine.
	 */
	public TicketMachine() {
		
	}
	
	/**
	 * Creates a new Ticket with balance for one ride
	 * @param startZone
	 * 		Zone that ride will start in
	 * @param endZone
	 * 		Zone that ride will end in
	 * @param discounted
	 * 		Is this ride discounted
	 * @return
	 * 		Ticket with balance of the cost for indicated ride
	 */
	public Ticket purchaseTicket(int startZone, int endZone, boolean discounted) {
		totalTickets++;
		totalCost += TicketUtil.calculateRideCost(startZone, endZone, discounted);
		return new Ticket(TicketUtil.calculateRideCost(startZone, endZone, discounted), discounted);
	}
	
	/**
	 * Creates a new Ticket with balance for multiple rides
	 * @param numRides
	 * 		Number of rides being payed for
	 * @param startZone
	 * 		Starting zone of rides
	 * @param endZone
	 * 		Ending zone of rides
	 * @param discounted
	 * 		Are these rides discounted
	 * @return
	 * 		Ticket with balance of the cost for indicated rides
	 */
	public Ticket purchaseTicket(int numRides, int startZone, int endZone, boolean discounted) {
		totalTickets++;
		totalCost += TicketUtil.calculateRideCost(numRides, startZone, endZone, discounted);
		return new Ticket(TicketUtil.calculateRideCost(numRides, startZone, endZone, discounted), discounted);
	}
	
	/**
	 * Creates a new Ticket with balance indicated
	 * @param amount
	 * 		Initial balance
	 * @param discounted
	 * 		Are rides with this Ticket discounted?
	 * @return
	 * 		Ticket with balance indicated
	 */
	public Ticket purchaseTicket(int amount, boolean discounted) {
		totalTickets++;
		totalCost += amount;
		return new Ticket(amount, discounted);
	}
	
	/**
	 * Returns total number of tickets sold
	 * @return
	 */
	public int totalTickets() {
		
		return totalTickets;
	}
	
	/**
	 * Returns total cost of all tickets (Money made from tickets sold)
	 * @return
	 */
	public int totalCost() {
		
		return totalCost;
	}
	
}
