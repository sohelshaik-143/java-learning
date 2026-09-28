import java.util.Scanner;

public class StudentNameAnalyzer {



    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("enetr tee name of the student--> ");
     String name= scanner.nextLine();
        System.out.println("name-->"+name);
        System.out.println("length-->"+name.length());
        System.out.println("uppercase-->"+name.toUpperCase());
        System.out.println("lowercase-->"+name.toLowerCase());



        //traversal
        System.out.println("characters");
        for (int i = 0; i < name.length() ; i++) {
            System.out.println(name.charAt(i));

        }

        //add reverse
        String reverse="";
        for (int i = name.length()-1; i >=0; i--) {
            reverse=reverse+name.charAt(i);

        }
        System.out.println("reversed -->"+reverse);

        //palindrome check

        if(name.equals(reverse)){
            System.out.println("it is palindrome yet");
        }else{
            System.out.println("it is not a palindrome");
        }
        //character counting
        System.out.println("enter the character you want to count--> ");
        char target =scanner.nextLine().charAt(0);
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==target){
                count++;
                System.out.println("count-->"+count);
                scanner.close();
            }

        }

    }

}

here it is the basic terminology an dwe hav ethe basic formulas to how to handle the strings with function and methods 
  and today i have build that a amini project on stringlength,chracter,reverse,palindrome checking and character counting and many more 
  
