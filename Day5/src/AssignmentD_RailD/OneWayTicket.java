package AssignmentD_RailD;

class OneWayTicket extends Ticket {

	public OneWayTicket(String startDate, String endDate, String originStation, String destinationStation) {
		super(startDate, endDate, originStation, destinationStation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OneWayTicket [" + super.toString() 
				+ "]";
	}
}

