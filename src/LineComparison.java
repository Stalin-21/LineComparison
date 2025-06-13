public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program ");

        int x1 = 1, y1 = 2;
        int x2 = 4, y2 = 6;

        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The length of the line is: " + length);

    }
}