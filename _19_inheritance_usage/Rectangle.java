package _19_inheritance_usage;

//Class hierarchy replacement for a tagged class  (Page 110-11)
class Rectangle extends FigureTrue {
	
	final double length;
	final double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}
	
}
