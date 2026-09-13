
public class Cone extends Shape {
	private double radius;
	private double height;
	
	public Cone(double radius, double height) {
		this.radius=radius;
		this.height=height;
	}

	@Override
	public double surface_area() {
		double area;
		area = Math.PI * Math.pow(radius, 2) + Math.PI * radius * height;
		return area;
	}

	@Override
	public double volume() {
		double vol;
		vol = (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
		return vol;
	}
	public String toString() {
		String message = String.format("Cone Surface area %.2f \nCone Volume %.2f", surface_area(),volume());
		return message;
	}

}
