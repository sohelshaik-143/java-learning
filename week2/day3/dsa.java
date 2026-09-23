max number

  class solution{
    public static void main(String[] args){
        int [] arr={12,32,4,3,56,7,87,78};
           System.out.println(large(arr));
    }
    public static int large(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }
}


it is the complexity of time --> O(n) bcoz it is traversing the  n times and 
  it has teh spac ecomplexity =--> O(1)


  min 


  package primenumbers;

class sol{
    public static void main(String[] args){
        int [] arr={-7851,12,32,4,3,56,7,87,78};
        System.out.println(large(arr));
    }
    public static int large(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]  < max){
                max=arr[i];
            }
        }
        return max;
    }
}



3. sum of teh array elements
  package primenumbers;

class sol{
    public static void main(String[] args){
        int [] arr={12,32,4,3,56,7,87,78};
        System.out.println(large(arr));
    }
    public static int large(int[] arr){
        int sum=0;
        for(int i=1;i<arr.length;i++){
            sum+= arr[i];
        }
        return sum;
    }
}


5.    average 

  package primenumbers;

class sol {
    public static void main(String[] args) {
        int[] arr = {12, 32, 4, 3, 56, 7, 87, 78};
        System.out.println("Average: " + getAverage(arr)); // Output: 34.875
    }

    public static double getAverage(int[] arr) {
        int sum = 0;

        // Traditional for loop using an index counter (i)
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Divide total sum by the count of elements
        return (double) sum / arr.length;
    }
}

4 .count the numbers


  package primenumbers;

class sol{
    public static void main(String[] args){
        int [] arr={12,32,4,3,56,7,87,78,58965,2566};
        System.out.println(large(arr));
    }
    public static int large(int[] arr){
        int max=50;
        int count=0;
         int avg=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                count++;
            }
            
        }

        return count;
    }
}
