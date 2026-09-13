
public class Sphere extends Shape{
	private double radius;

	public Sphere (double radius) {
		this.radius = radius;
	}
	@Override
	public double surface_area() {
		double area;
		area = 4*Math.PI * Math.pow(radius, 2);
		
		return area;
	}

	@Override
	public double volume() {
		double vol;
		vol = (4.0/3.0)*Math.PI *Math.pow(radius , 3);
		return vol;
	}
	
	public String toString() {
		String message = String.format("Sphere Surface area %.2f \nSphere Volume %.2gf\n\n", surface_area(),volume());
		return message;
	}

}
