two pointer method using for reverse of an array


  package primenumbers;

public class reverse {
    static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        rvr(arr);
        for(int value : arr){
            System.out.println(value);
        }

    }
    static void rvr(int[]arr){
        int left=0;
        int right = arr.length-1;
        while (left <  right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;

        }
    }
}


complexity analysis:O(N);
