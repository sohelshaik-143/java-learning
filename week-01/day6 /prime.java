// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
         System.out.println(prime(45));
                 System.out.println(prime(45));
                 System.out.println(prime(789));         System.out.println(prime(785));
                 System.out.println(prime(999));
                 System.out.println(prime(17));
        

      
    }
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        //here we are writing for loop bcoz we are iterating every number which we are givig right
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

here wwe have learn about prime number ,what was the intution and y it matters and algorithm we  have done  



  

