here it is teh today dsa problem by give n in the format of dsa seris public class secondlargest {
    // FIXED: Added public so Java can launch the program
    public static void main(String[] args) {
        int [] arr = { 100, 20, 50, 80, 70 };
        int result = secondlargest(arr);
        System.out.println(result); // Will now correctly print: 80
    }
    
    public static int secondlargest(int[] arr) {
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } 
            // FIXED: Checked if arr[i] is greater than secondlargest
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
}

time complexity is O(N);
space complexity is O(1);
