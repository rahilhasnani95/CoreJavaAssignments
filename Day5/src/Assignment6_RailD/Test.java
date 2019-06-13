package Assignment6_RailD;

public class Test {

	public static void main(String[] args) {

		Ticket ticket = new OneWayTicket("1 march", "1 march", "sugarland", "houston");
		System.out.println(ticket.toString());
	
		Ticket ticket2 = new ReturnTicket("5 march", "10 march", "dallas", "houston");
		System.out.println(ticket2.toString());
		
		Ticket ticket3 = new MultiUseTicket("10 march", "30 march", "sugarland", "houston");
		System.out.println(ticket3.toString());
		Ticket ticket4 = new MultiUseTicket("10 april", "30 march", "new york", "houston");
		System.out.println(ticket4.toString());
	}

}
