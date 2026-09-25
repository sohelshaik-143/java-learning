linera search for index this are teh problems are a;so practised in the above sessions like last occurance and first occurance and 
  greaer than 50- are how many like this here 
  today we have doe about what is static and what is instance variables and when it uses and where it can uses where it can do
  after that we have done the basic dsa problem on linera searvh is to find the index value of teh given target 

  class Main {
    public static void main(String[] args) {
       int[]arr ={10,25,7,42,18};
        int target =10;
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
