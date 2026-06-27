import java.util.*;
public class sum {
    public static int Sum(int a, int b){ // ekhane int a aar b function er parameter jar sahhajje um calculate kora jabe
        int sum = a+b;
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = Sum (c, d); // okahne a aar b die fu. k bojhano hyeche oibhabe kaj korte ekhane c, d die kaj korano hyeche
        System.out.print(sum);
    }
}