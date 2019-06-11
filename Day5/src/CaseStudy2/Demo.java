package CaseStudy2;

class Travel
{
	private char modeOfTravel;
	private int noOfTickets;
	private double amount;
	public char getModeOfTravel() {
		return modeOfTravel;
	}
	public void setModeOfTravel(char modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}

public class Demo {

	public static void main(String[] args) {
		int serviceCharge = 0;
		Travel travel = new Travel();
		travel.setModeOfTravel('F');
		travel.setNoOfTickets(5);
		
		if(travel.getModeOfTravel() == 'F')
		{
			serviceCharge = 500;
			travel.setAmount(serviceCharge * travel.getNoOfTickets());
			System.out.println("Total Service Charge : $" +travel.getAmount());
		}
		else if(travel.getModeOfTravel() == 'T')
		{
			serviceCharge = 100;
			travel.setAmount(serviceCharge * travel.getNoOfTickets());
			System.out.println("Total Service Charge : $" +travel.getAmount());
		}
		else if(travel.getModeOfTravel() == 'B')
		{
			serviceCharge = 50;
			travel.setAmount(serviceCharge * travel.getNoOfTickets());
			System.out.println("Total Service Charge : $" +travel.getAmount());
		}
		else
		{
			System.out.println("Enter correct mode of travel");
		}
	}

}
