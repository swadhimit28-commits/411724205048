public class June10AN {
    public static void main(String[] args) {
        int[] arr  = new  int[] {10,20, 20,20,20,30,40,50};
        int target =60;
        boolean flag = false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == target) {
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("not found");
        } else {
            System.out.println("found");

            }
        
    }
}
    

