package Series;

public class Fibonacci {
    public void printSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
package Series;

public class Cube {
    public void printSeries(int n) {
        System.out.print("Cube Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + " ");
        }
        System.out.println();
    }
}
package Series;

public class Square {
    public void printSeries(int n) {
        System.out.print("Square Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }
}
import Series.Fibonacci;
import Series.Cube;
import Series.Square;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of terms
        System.out.print("Enter the number of terms to generate: ");
        int n = scanner.nextInt();

        // Create objects of the classes in the Series package
        Fibonacci fibonacci = new Fibonacci();
        Cube cube = new Cube();
        Square square = new Square();

        // Generate the series
        fibonacci.printSeries(n);
        cube.printSeries(n);
        square.printSeries(n);
    }
}
