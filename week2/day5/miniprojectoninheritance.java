package primenumbers;

class user{
    protected String name;
    protected String email;
    user(String name,String email){
        this.email=email;
        this.name=name;
    }
    void login(){
        System.out.println(email + " loggin successfully");
    }

}
class student extends user{
    private int rollno;
    student(String email, String name, int rollno) {
        super(name, email);
        this.rollno = rollno;
    }
        void submitevidance(){
            System.out.println(name+ " " + rollno +" submitted successfully;");
        }


    }


public class miniproject {
    static void main(String[] args) {
        student student = new student("sohel","sohel@gmail.com",12);
        student.submitevidance();
        student.login();
    }

}
hee it is teh mini project i have done by using inheritance about how the inheritance works and how we inherit the parents class to child class 
we would try with admin and recruiter as well but not with using inheritance we it can only support single inheritance and multilevel inheritance 
  
