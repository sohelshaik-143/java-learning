
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

/here it is simple approach i just solve the problems like this  has the one logic on that one logic we have to find it mate
    approach like reversal of number approach as well but we add one extra is i statement if original == reversal then it is palindrome if not it is not
     palindrome tahts it simple dsa question and its time complexity is  there is no n number iterations it would be probably O(n) 
