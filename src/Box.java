
public class Box {
	
	double width;
	double height;
	double length;
	
	public Box() {
		width = 10;
		height = 10;
		length = 5;
	}
	
	public Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	public double compute() {
		return width * height * length;
		
	}
	}
