package quadfunc.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner scannerObj = new Scanner(System.in)) { //  Using try so I don't have to close the Scanner
            while (true) {
                System.out.println("Quadratic function formula: ax^2 + bx + c");
                System.out.print("a = ");
                double a = scannerObj.nextDouble();
                System.out.print("b = ");
                double b = scannerObj.nextDouble();
                System.out.print("c = ");
                double c = scannerObj.nextDouble();
                CalculateRoots(a, b, c);
                CalculateVertices(a, b, c);
            }
        }
    }

    static void CalculateRoots(double a, double b, double c){
        double discriminant = Math.pow(b, 2) - 4*a*c;
        if(discriminant >= 0){
            double posroot = (-b + Math.sqrt(discriminant)) / 2*a;
            double negroot = (-b - Math.sqrt(discriminant)) / 2*a;
            System.out.println("--------------------------------------------------------------------------------------");   //  Seperator
            System.out.println("Negative Root: " + negroot);
            System.out.println("Positive Root: " + posroot);
        } else if(discriminant < 0){
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("--------------------------------------------------------------------------------------");   //  Seperator
            System.out.println("Complex Roots: " + realPart + " ± " + imaginaryPart + "i");
        }
    }

    static void CalculateVertices(double a, double b, double c){
        double discriminant = Math.pow(b, 2) - 4*a*c;
        double xvertex = -b / 2*a;
        double yvetex = -discriminant / 4*a;
        System.out.println("X Vertex: " + xvertex);
        System.out.println("Y Vertex: " + yvetex);
        System.out.println("--------------------------------------------------------------------------------------");   //  Seperator
    }
}
