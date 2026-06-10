public class Even{
    public static void main(String[] args) {
        int[] arr = {10,20,2,4,6,8,9};

        System.out.println("Sum of even positions = " + sumEvenPosition(arr));



    }
    public static int sumEvenPosition(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }

        return sum;
    }

    
    }

