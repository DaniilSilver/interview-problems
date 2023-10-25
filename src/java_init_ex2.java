import java.util.Scanner;
public class java_init_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int liters = sc.nextInt();
        if (times < 0 || liters < 0||times>=7){
            System.out.println("Неверный ввод! ");
        }
        else {
            int jija =0;
            for (int i=1;i<=16;i++){
                jija += times*liters;
                System.out.println("К "+i+" неделе будет выпито "+jija+ " литров жидкости");
            }
            if (jija >=120) System.out.println("Студент принят в IT-клуб");
            else System.out.println("К сожалению,студент не принят в клуб");
        }

    }
}
