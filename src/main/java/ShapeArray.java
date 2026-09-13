//Rene Sequeira
//Module 4 Critical Thinking Assignment


public class ShapeArray {

	public static void main(String[] args) {
		Shape sphere = new Sphere(3.0);
		Shape cylinder = new Cylinder(4.0,7.0);
		Shape cone = new Cone(9.0,5.0);
		
		Shape [] shapeArray= {sphere,cylinder,cone};
		
		for(Shape s : shapeArray) {
			System.out.println(s.toString());
			
		}

	}

}
