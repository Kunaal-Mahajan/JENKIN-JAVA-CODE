import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Welcome kunal mahajan");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println(new Date());
    }
}