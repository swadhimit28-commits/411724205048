public class ReversedTrain {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reverseArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    
}
    

