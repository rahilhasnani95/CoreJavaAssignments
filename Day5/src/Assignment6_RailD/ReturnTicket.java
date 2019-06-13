package Assignment6_RailD;

class ReturnTicket extends Ticket{

	public ReturnTicket(String startDate, String endDate, String originStation, String destinationStation) {
		super(startDate, endDate, originStation, destinationStation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ReturnTicket " + super.toString()
				+ "]";
	}

}
