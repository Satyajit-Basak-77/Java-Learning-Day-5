import java.util.*;
public class mul {
    public static int Mul(int a, int b){ // ekhane int a aar b function er parameter jar sahhajje um calculate kora jabe
        return a*b;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();

        int mul = Mul (c, d); // okahne a aar b die fu. k bojhano hyeche oibhabe kaj korte ekhane c, d die kaj korano hyeche
        System.out.print(mul);
    }
}