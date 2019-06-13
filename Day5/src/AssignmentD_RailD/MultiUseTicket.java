package AssignmentD_RailD;

class MultiUseTicket extends Ticket {

	private static int denomination = 10;
	
	
	public MultiUseTicket(String startDate, String endDate, String originStation, String destinationStation) {
		super(startDate, endDate, originStation, destinationStation);
		setDenomination(getDenomination() - 1);
	}
	
	@Override
	public String toString() {
		return "MultiUseTicket [Denomination = " + getDenomination() + ", "+ super.toString()
				+ "]";
	}

	public static int getDenomination() {
		return denomination;
	}
	public static void setDenomination(int denomination) {
		MultiUseTicket.denomination = denomination;
	}
	
	
	

}
