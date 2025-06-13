public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program ");

        // First line points
        double x1 = 1, y1 = 2;
        double x2 = 4, y2 = 6;

        // Second line points
        double a1 = 0 , b1 = 0;
        double a2 = 3 , b2 = 4;

        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Double length2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

        System.out.println("First line length is " + length1);
        System.out.println("Second line length is " + length2);

        if(length1.equals(length2)){
            System.out.println("Lines are equal");
        }else {
            System.out.println("Lines are not equal");
        }
    }
}