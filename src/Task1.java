import java.util.Random;

public class Task1 {

    private static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("String :");
        for (int i = 0; i < 100; i++) {

            int one = random.nextInt(1000);
            System.out.print(String.valueOf(one + " "));

        }
        System.out.println();
        System.out.println("StringBuilder : ");
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 100; j++) {
            int two = random.nextInt(1000);
            sb.append(two).append(" ");
        }
        System.out.println(sb);


    }
}