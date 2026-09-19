HERE WE AR E WRITING HAT TODAY WE HAVE TO LEARN THE TOPIC CALLED FACTORIAL + FIBONACCI
  here factorial is the postive integer and the product of integers from 1 to n is factorial ;
we want that 5! =120;

code part
  class solution{
  public static void main(string[] args){
    int result=factorial(5);
    System.out.println(result);
  }
  public static long factorial(long n){
    long result=1;
    for(int i=1;i<=n;i++){
      result=result*i;
    }
  }
  return result;
}
}
why we took long here means factorial canges quickly because it has large number so normal integer can't handle it
  similarly it has a recurisv ecall we can do that 
   class solution{
  public static void main(string[] args){
    int result=factorial(5);
    System.out.println(result);
  }
  public static long factorial(long n){
    if(n==0 || n==1){
      return 1;
    }
    return n*factorial(n-1);
  }
}
here we can take teh edge cases like if n==0 and n==1 it will return y means factorial doesn't have teh least value
  and return statemnet we have to thik like return n*factoriall(n-1);

fibonacci serieso f number sjust we have ot do that if we want the fbonnaci firstly we have to know what it is fibonacci means
  every number  is the  sum of two previous numbers 

  dsa problem factorial ::: 


  
  class solution{
  public static void main(string[] args){
    int result=factorial(5);
    System.out.println(result);
  }
  public static long factorial(long n){
    long result=1;
    for(int i=1;i<=n;i++){
      result=result*i;
    }
  }
  return result;
}
}

  supported problems;


#1. fibonnaci series n number  code 

  
  package primenumbers;

public class fibonacci {
        public static void main(String[] args) {
            int result = fibonacci(20); // 1. Save the answer into a variable
            System.out.println(result);
        }
        public static int fibonacci(int  n){
            int a=0;
            int b=1;
            for(int i=0;i<n;i++){
                System.out.println(a+" ");

                int next = a+b;
                a = b;
                b = next;
            }
            return n;
        }
    }


  
