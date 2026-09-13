
public class Cylinder extends Shape {

	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	@Override
	public double surface_area() {
		double area;
		area = 2 *Math.PI*radius*(radius + height);
		return area;
	}

	@Override
	public double volume() {
		double vol;
		vol = Math.PI * Math.pow(radius, 2) * height;
		return vol;
	}
	
	public String toString() {
		String message = String.format("Cylinder Surface area %.2f \nCylinder Volume %.2f\n\n", surface_area(),volume());
		return message;
	}

}
