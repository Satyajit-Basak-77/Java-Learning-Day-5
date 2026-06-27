import java.util.*;
public class name {
    public static void printname(String name){
        System.out.print(name);
        return;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printname(name); // function call
    }
}
