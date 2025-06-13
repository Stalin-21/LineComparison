class Point {
    double x, y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Line implements Comparable<Line> {
    Point start, end;

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    double getLength() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;
        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
}

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program ");

        Line line1 = new Line(new Point(1, 2), new Point(4, 6));
        Line line2 = new Line(new Point(0, 0), new Point(3, 4));

        System.out.println("Line1 length: " + line1.getLength());
        System.out.println("Line2 length: " + line2.getLength());

        System.out.println("Are lines equal? " + line1.equals(line2));

        int comparison = line1.compareTo(line2);
        if (comparison > 0)
            System.out.println("Line1 is longer");
        else if (comparison < 0)
            System.out.println("Line2 is longer");
        else
            System.out.println("Both lines are equal");
    }
}