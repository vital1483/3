import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    private static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("String :");
        int one = 0;
        for (int i = 0; i < 100; i++) {

            one = random.nextInt(1000);

            System.out.print(String.valueOf(one + " "));

        }
        System.out.println();
        System.out.println("StringBuilder : ");
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 100; j++) {
            int two = random.nextInt(1000);
            sb.append(two).append(" ");
            System.out.print(sb);
            String regex = "\\d{2}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(String.valueOf(one));
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, "-1");
                //  Pattern pattern = Pattern.compile("\\d{2}");
            }


        }

    }
}