
public class Exchange {

	//TODO: declare data members - amount, rate, conversion
	private double amount;
	private double rate;
	private double conversion;
	
	//TODO: constructor
	public Exchange () {}
	
	//TODO: constructor - amount, rate
	public Exchange (double amount, double rate, double conversion) {
		this.amount = amount;
		this.rate = rate;
		this.conversion = conversion;
	}
	
	//TODO: set methods
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	//TODO: calculation = conversion
	public void compute() {
		conversion = amount * rate;
	}
	
	//TODO: get method return conversion
	public double getConversion() {
		return conversion;
	}

	}

