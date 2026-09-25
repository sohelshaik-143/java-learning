// Write and run Java online using this editor.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       int[]arr ={101,105,108,112,120};
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the target element: ");
        int target = scanner.nextInt(); 
        int result=linearsearch(arr,target);
        System.out.println(result);
        
    }
    public static int linearsearch(int[] arr,int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

here it is teh simple mini challemge for me what means here there is a data is list of students 
  user wnats to ask to enter the id and then we have to perform the lmnear search after that we have to return the index it just a simple program 
  and we have to know if user wants to enetr the is we have import the scanner package and 
  we have to use the scaner approach how means
  we dont  know about target then how can we assueme the target on that time we habe to approach about scanner method
  just simple create a scaner approach scanner sc = new scanner(system.in);
then print that enetr the id and after that assign this scanner class to target 
  how ?
  int targert = scanner .nextint();
thats it scanner is fixed to target and now what ever the users will add into id it will perform
  linear search and give the index value that it
  \\\complexity mostly it has teh analysis of O(n);
bcoz if we found at least it has to iterate all teh objects so we are iterating the terms by n times it complexity is O(N).
