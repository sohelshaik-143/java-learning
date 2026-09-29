public class palindromeusingtwopointer {
    static void main(String[] args) {
         String name = "sohelehos";
        System.out.println(palindrome(name));

    }
    public static boolean palindrome(String name){

        int left=0;
        int right=name.length()-1;
        while(left < right){
            if(name.charAt(left)!=name.charAt(right)){
                return false;

            }
            left++;
            right--;
        }
        return true;
    }
}
hre we haev used teh palindrome using string and two pointer method whether it is used to thi sapproach is to like update and traverse teh entire
  string at once so we can use this method as the to thid problem.
  aand its time complexity ois O(n);

  
