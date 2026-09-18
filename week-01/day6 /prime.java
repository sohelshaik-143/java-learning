// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println(prime(45));
        System.out.println(prime(45));
        System.out.println(prime(789)); 
        System.out.println(prime(785));
        System.out.println(prime(999));
        System.out.println(prime(17));
    }
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        //here we are writing for loop bcoz we are iterating every number which we are givig right
        for(int i=2;i<n;i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
}

here wwe have learn about prime number ,what was the intution and y it matters and algorithm we  have done  

here we ahve taken teh value 2 y means if it has it's own factors 1 is factor of all numbers and then that's why we hoose 2 instead of 1 
    and we use one more thing n%i==0 here it is define that n nis a number we hace to give and i is the value we have declared 
tracing if we take 17
    17%2 ==0 --> 1 it is not zero so it is true
    18%2 ==0 --> 0 it is  0  so it is false 

    optimised code 
    for (int i=0;i*i<n;i++)

    we can use here  one important question we have to rise why i*i 
    bcoz if we take 100 we really need to check all the values from 3,4,5 ...,100 not realy right for that we use the function sqroot(n) another question y only sqrt(j)
    good question suppose we took the value of 18 tell me the factors 2*9,3*6,18*1,right afer 3*6 the things will repaet again in reverse order for 
    that we dont need to check so 3*6 repeatuing term so ,then we have to take that itration then only we checj sqrt(18) some value we oly check for that value only
    taht it is the code is optimised with that in mathematical terms we can change the i*i = i^2 == sqrt(n)......


    # complexity 
    worst case ==O(n)
    best case == O(sqrt(n)) // approx
    pace complexity == O(1) spaceeee
    --> the above problem is the  dsa problem 
    
     
  

