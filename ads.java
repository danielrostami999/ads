import java.util.Scanner;

public class ads {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter cofficients of equation: a*x + b = 0.");
        System.out.println("enter a:");
        double a = input.nextFloat();
        System.out.println("enter b:");
        double b = input.nextFloat();
        EquationSolver.SolveEq(a, b);
        System.out.println("");
        System.out.println("enter x:");
        double x = input.nextFloat();
        EquationSolver.ads(x);  
    }
}