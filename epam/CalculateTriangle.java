//Write a program which takes 3 points as the parameters of the triangle(in total 6 coordinates)
//Then, the program defines whether such triangle exists. If it does, return to the end user the area of the triangle and its centroid. 

class CalculateTriangle {
    Scanner scanner = new Scanner();
    private final Point a, b, c;
    private final double ab, bc, ac;
    Line line = new Line();
    Angle angle = new Angle();


public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;

    this.ab = line.drawLine(a, b);
    this.bc = line.drawLine(b, c);
    this.ac = line.drawLine(a, c);

    if (this.ab + this.ac < this.bc ||
            this.ab + this.bc < this.ac ||
            this.ac + this.bc < this.ab)
        throw new IllegalArgumentException("The triangle can't exist!");


    Point vectorAB = new Point(b.getX() - a.getX(), b.getY() - a.getY());
    Point vectorAC = new Point(c.getX() - a.getX(), c.getY() - a.getY());
    Point vectorBC = new Point(b.getX() - c.getX(), b.getY() - c.getY());
    Point vectorBC_1 = new Point(c.getX() - b.getX(), c.getY() - b.getY());

    double angleAB = angle.getAngle(vectorAB, vectorAC);
    double angleAC = angle.getAngle(vectorAB, vectorBC);
    double angleBC = angle.getAngle(vectorAC, vectorBC_1);

    if (Math.abs(angleAB + angleAC + angleBC - 180) >= 1.e-8 ||
            Math.abs(angleAB) <= 1.e-5 || Math.abs(angleAC) <= 1.e-5 || Math.abs(angleBC) <= 1.e-5 ||
            Math.abs(angleAB - 180) <= 1.e-5 || Math.abs(angleAC - 180) <= 1.e-5 || Math.abs(angleBC - 180) <= 1.e-5
    )
        throw new IllegalArgumentException("The triangle can't exist!");
}

public double area() {
    double p = (ab + ac + bc) / 2;
    return Math.sqrt((p - ab) * (p - ac) * (p - bc) * p);
}

public Point centroid() {
    return new Point((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
}
}
