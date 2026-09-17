// sum of teh digits 
class Main {
    public static void main(String[] args) {
    int  number=157897;
        // int reverse=0;
        
        int sum=0;
        while( number > 0  ){
            int last = number%10;
            // reverse= reverse*10+last;
           sum+= last;
                  number = number /10;
        }
        
  
        System.out.println(sum);
    }
}
#2 //product of digits

  class Main {
    public static void main(String[] args) {
    int  number=157;
        // int reverse=0;
        
        int product=1;
        while( number != 0  ){
            int last = number%10;
            // reverse= reverse*10+last;
           product*= last;
                  number = number /10;
        }
        
  
        System.out.println(product);
    }
}

here poduct starts from 1 bcoz when teh product 80 becomes 0 so it is starts by 1 its basic 


  #3.//largest digit
  se this editor to write, compile and run your Java code online

        class Main {
    public static void main(String[] args) {
    int  number=157;
        // int reverse=0;
        int largest =0;
      
        while( number > 0  ){
            int last = number%10;
            // reverse= reverse*10+last;
           if(last > largest ){
               largets = last;
                  
        }
        number = number /10;
        }
        System.out.println(largest);

     
    }
}

#4 .smallest digit 
      class Main {
    public static void main(String[] args) {
    int  number=157;
        // int reverse=0;
        int smallest =9;
      
        while( number > 0  ){
            int last = number%10;
            // reverse= reverse*10+last;
           if(last  < smallest ){
              smallest = last;
                  
        }
        number = number /10;
        }
        System.out.println(smallest);

     
    }
}
here some importanyt topics is while in greates we dont mentio it is greates and we intiaslise int largts =0
  bcoz it automatically takes that which is greater and it is the term there is no limit in largest number in postive numbers 
  but when it come sto smalles we have to mention int smallest =9 bcoz there is no big number greater than than bcoz it has \but
  it is combinatio nof two numbers right so we have to mention taht int smallest =9;

good to enough mate 
  #5 count even digits 
  // se this editor to write, compile and run your Java code online

        class Main {
    public static void main(String[] args) {
    int  number=152667;
        // int reverse=0;
     int count =0;
        
      
        while(  number > 0  ){
            int last = number%10;
            // reverse= reverse*10+last;
            if (number%2==0){
                
                count++;
            }
          
        number = number /10;
        }
        System.out.println(count);

     
    }
}

here it is teh graet part i have done some mistake with code i am improivng my intution how to adapt code and what we need to code and all
   i will try to push and forward and forward mate 

  thnk u signing off for thsi file 17/9/26 and 9:43 pm 
  
