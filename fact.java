    import java.util.*;
public class fact {
    public static int Fact(int a){ // ekhane int a aar b function er parameter jar sahhajje um calculate kora jabe
        int fact = 1;
        for(int i=a; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        int factorial = Fact (c); // okahne a aar b die fu. k bojhano hyeche oibhabe kaj korte ekhane c, d die kaj korano hyeche
        System.out.print("Your factorial of " + c + " is " + factorial);
    }
}