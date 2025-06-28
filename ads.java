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
        /*input.nextLine();
        System.out.println("enter something to exit...");
        input.nextLine();*/
        System.out.println("enter x:");
        double x = input.nextFloat();
        EquationSolver.ads(x);  
    }
}

public class EquationSolver {
    public static void SolveEq(double a, double b){
        double x = -b/a;
        System.out.println("Solving Equation: ");
        System.out.format("%f * x = %f = 0\n", a, b);
        System.out.format("Resault = x = %f", x);
    }
    
    public static void ads(double x){
        if (x < 0) x = -x;
        
        System.out.format("Resault = %f", x);
    }
}
