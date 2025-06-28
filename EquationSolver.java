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
