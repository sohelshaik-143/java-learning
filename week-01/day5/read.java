today i have learned the code and about count of digits this is 4 th problem in pattern analysing if one thing i wan t to say i we can see 
the problem before enter int o code try to identify the pattern and as and do teh code part
here i have learned some thing new about paattern recognisation 
today i learned about count of digits even though it is easy it has simple approach like 
take an integer --> remove the last digit using the approach like number %10 using modulo symbol(it useful to get remainder like last digit)
--> ad then reverese the number on ce we get the remainder and --> update the count after that --> number =number/10; here it is used give me teh remaining digits in the integer 
afetr that it will iterarte until teh condition true and it stops 
here is the code of it 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    int  number=-157897;
        int reverse=0;
        int count =0;
        while(number != 0 || number> 0  ){
            int last = number%10;
            reverse= reverse*10+last;
            count++;
                  number = number /10;
        }
        
  
        System.out.println(count);
    }
}

here i have uses two condition s one is while number !=0 it is correct for all negative and positive numbers 
    if we use numbers> 0 it is only uses for greater than 0 lie positive numbers ponly thats great what if i we do 
    number <0 it is only for lessthan 0 numbers

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    int  number=-157897;
        int reverse=0;
        int count =0;
        while(number != 0 || number  <  0  ){
            int last = number%10;
            reverse= reverse*10+last;
            count++;
                  number = number /10;
        }
        
  
        System.out.println(count);
    }
}
    
