here it is teh third largest where i wrote it by my own by the approach as sae as the second largwets elemnt
  public class thirdlargest {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        System.out.println(thirdlargest(arr));

    }
    public static int thirdlargest(int[] arr){
        int largest=arr[0];
        int secondlargest= Integer.MIN_VALUE;
        int thirdlargest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                thirdlargest = secondlargest;
                secondlargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondlargest && arr[i]!= largest) {
                thirdlargest = secondlargest;
                secondlargest = arr[i];


            }else if (arr[i] > thirdlargest && arr[i]!= largest){
                thirdlargest=arr[i];

            }

        }
        return thirdlargest;
    }
}


its complexity analysis would be we are traversing one time at best case so it would be O(1) in best case wors case O(N)
 space complexity i constant O(1);
