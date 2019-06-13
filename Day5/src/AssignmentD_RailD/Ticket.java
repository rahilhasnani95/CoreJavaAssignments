package AssignmentD_RailD;

public class Ticket {

	private static int ticketNo = 0;
	private String startDate;
	private String endDate;
	private String originStation;
	private String destinationStation;
	public Ticket(String startDate, String endDate, String originStation, String destinationStation) {
		++ticketNo;
		this.startDate = startDate;
		this.endDate = endDate;
		this.originStation = originStation;
		this.destinationStation = destinationStation;
	}
	public static int getTicketNo() {
		return ticketNo;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getOriginStation() {
		return originStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	@Override
	public String toString() {
		return "Ticket [Ticket No = " + ticketNo + ", startDate=" + startDate + ", endDate=" + endDate + ", originStation=" + originStation
				+ ", destinationStation=" + destinationStation + "]";
	}
	
	
}
