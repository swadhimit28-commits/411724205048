public class EvenIndexing {

    public static void main(String[] args) {

        int[] arr = {10,20,2,4,6,8,9};

        for (int i = 0; i < arr.length; i += 2) {
            System.out.println("Index = " + i + ", Value = " + arr[i]);
        }
    }
}