
class Main {
    public static void main(String[] args) {
        int number=424;
        int original=number;
       int reverse=0;
        while(number!=0){
            int last=number%10;
            reverse=reverse*10+last;
            number =number/10;
        }
        System.out.println(" "+reverse);
        //check 
        if(original==reverse){
              System.out.println("is  palindrome");
        }else{
              System.out.println(" not  palindrome");
        }
        
    }
}
