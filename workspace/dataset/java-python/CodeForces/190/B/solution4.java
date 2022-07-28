// package problem_solving.b; import java.util.Scanner; public class Surrounded {     static Point firstPoint;    static Point secondPoint;    static int firstRadius;    static double secondRadius;     public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         firstPoint = new Point(scanner.nextInt(), scanner.nextInt());        firstRadius = scanner.nextInt();        secondPoint = new Point(scanner.nextInt(), scanner.nextDouble());        secondRadius = scanner.nextDouble();        double distanceBetweenCenters = calculateEuclideanDistance(firstPoint, secondPoint);         if (distanceBetweenCenters > firstRadius + secondRadius) {            System.out.printf("%.15f", (distanceBetweenCenters - firstRadius - secondRadius) / 2);        } else if (distanceBetweenCenters == firstRadius + secondRadius) {            System.out.printf("%.15f", 0.0);        } else {            //overlapping circles            if (distanceBetweenCenters < firstRadius || distanceBetweenCenters < secondRadius) {                //touching from inside                //0 0 100                //40 60 27.9                if (Math.floor(firstRadius - secondRadius) == Math.floor(distanceBetweenCenters) || Math.floor(secondRadius - firstRadius) == Math.floor(distanceBetweenCenters)) {                    System.out.printf("%.15f", 0.0);                }                //inside each other                else {                    double bigRadius = Math.max(firstRadius, secondRadius);                    double smallRadius = Math.min(firstRadius, secondRadius);                    System.out.printf("%.15f", (bigRadius - distanceBetweenCenters - smallRadius) / 2);                }            } else if (firstRadius + secondRadius - distanceBetweenCenters > 0) {                System.out.printf("%.15f", 0.0);            }        }    }     public static double calculateEuclideanDistance(Point firstPoint, Point secondPoint) {        double euclideanFirstTerm = Math.pow(secondPoint.x - firstPoint.x, 2);        double euclideanSecondTerm = Math.pow(secondPoint.y - firstPoint.y, 2);        return Math.sqrt(euclideanFirstTerm + euclideanSecondTerm);    }     static class Point {        double x;        double y;         Point(double x, double y) {            this.x = x;            this.y = y;        }     }}
