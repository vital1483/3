public class Task4 {

    public static void main(String[] args) {
        int count=0;
        String str = "На дворе трава, на траве дрова .Не руби дрова на траве двора.";
        String[] parts = str.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);


        }

    }
}

