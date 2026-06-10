public class SortedAarray{
     public static void main(String[] args) {

        int[] arr = {10, 20, 15, 40, 50};

        System.out.println( Sorted(arr));
     }
    
    public static boolean Sorted(int[] arr) {

        for (int i = 0; i < arr.length -1 ; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}

   