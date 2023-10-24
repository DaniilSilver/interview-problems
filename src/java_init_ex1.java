import java.util.Scanner;
public class java_init_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string: ");
        String st = sc.nextLine();
        System.out.println("Input n: ");
        int n = sc.nextInt();
        System.out.println();
        if (n<=1) System.out.println(st);
        else {
            for (int i=0;i<=n;i++){
                System.out.println(st);
            }
        }
        sc.close();




    }
}
