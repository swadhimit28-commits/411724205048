public class Averager{
    public static void main(String[] args) {
        int[] scores = {10,20,30,40,50};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double average  = (double) sum / scores.length;
        System.out.println("Average = "  + average);
    }
}