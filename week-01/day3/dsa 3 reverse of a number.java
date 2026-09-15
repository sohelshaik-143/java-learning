// reverse of  a number
  public class main{
  public static void main(string[] aregs){
    int number=12345;
    int reverse=0;
    while(number!=0){
      int last = number %10;
      reverse=reverse*10+last;
      number=number/10;
    }
    system.out.println("value"+" " +reverse);
  }
}
here teh intution is simple while number is not equal to 0 --> do this number%10 ==taking the last value
  and then after rhat make it as reverse how means reverse =reverse *10+last--> if number=12345;
it is not !=0 so it move to next line number %10--> taking last value right 5
  after that 
  reverse = 0*10+last =5;
12345=12345/10;--> 1234 then repetion until it changes to full number into reverse after that 
  it will print of new line with the sign value==54321;

