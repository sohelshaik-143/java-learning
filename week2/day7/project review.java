student .java


  public class student {
        private int id;
        private double cgpa;
        private String name;
        private String branch;


    // Constructor
        public student(int id, double cgpa, String name, String branch) {
            this.id = id;
            this.cgpa = cgpa;
            this.name = name;
            this.branch = branch;

        }
//        public void setid(int id){
//            this.id=id;
//
//        }
        //getter methods
        public int getid(){
            return id;
        }


        public String getbranch(){
            return branch;
        }

        public String getName(){
            return name;
        }

        public double getCgpa(){
            return cgpa;
        }

        //setters
    }



test student java
  

import java.util.Scanner;

public class teststudent {
    static int count = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Aligned to use lowercase 'student' to match your class file
        student[] students = new student[5];

        // Let's add a student using scanner input
        addstudent(students);
        displaystudents(students);
        searchstudent(students);
        lowestcgpa(students);
    }

    // Aligned to use lowercase 'student[]'
    static void addstudent(student[] students) {
        System.out.println("Enter the ID:-->");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the CGPA:-->");
        double cgpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the name -->");
        String name = scanner.nextLine();

        System.out.println("Enter the branch-->");
        String branch = scanner.nextLine();

        // Aligned to lowercase 'student'
        student newStudent = new student(id, cgpa, name, branch);

        students[count] = newStudent;
        count++;
        System.out.println("Student added successfully!");
    }
    static void displaystudents(student[] students){
        if(count==0){
            System.out.println("no student is found-->0");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("id"+ " -->"+ students[i].getid());
            System.out.println("branch"+"-->"+students[i].getbranch());
            System.out.println("name"+ " -->"+students[i].getName());
            System.out.println("cgpa"+ " -->"+students[i].getCgpa());
            System.out.println("----------------");



        }


    }
    static void searchstudent(student[] students){
        System.out.println("enter the id of the student::-->");
        int target = scanner.nextInt();
        for (int i = 0; i < count ; i++) {
            if(students[i].getid()== target){
                System.out.println(" STUDENT FOUND--->>>>>>");
                System.out.println("id"+ " -->"+ students[i].getid());
                System.out.println("branch"+"-->"+students[i].getbranch());
                System.out.println("name"+ " -->"+students[i].getName());
                System.out.println("cgpa"+ " -->"+students[i].getCgpa());
                System.out.println("----------------");
                return ;

            }

        }
        System.out.println("student not found");

    }
    static void lowestcgpa(student[] students){
        if(count==0){
            System.out.println(" student is not found");
        }
        student lowest=students[0];
        for (int i = 0; i <count ; i++) {
            if(students[i].getCgpa()< lowest.getCgpa()){
                lowest=students[i];

            }
            System.out.println(" STUDENT  lowest cgpa FOUND--->>>>>>");
            System.out.println("id"+ " -->"+ lowest.getid());
            System.out.println("branch"+"-->"+lowest.getbranch());
            System.out.println("name"+ " -->"+lowest.getName());
            System.out.println("cgpa"+ " -->"+lowest.getCgpa());
            System.out.println("----------------");

        }


    }

}


here it has a simple and impressive student management system with oops concepts and dsa algorithmns herei can found that where we can uswe teh a;lgorithms
  and i am so thankful to chatgp foe kearning and teachng teh piece bt piece here her ei found that hoe the objects works and how the encapsulaion and polymorphism 
  and other oops concepts will works as well as i learn about arrays and how teh arrays we will manage and update that and 
  modifiers ,getters and seetters and howe to create a methds and howe we can do that alla re learned by this project and i am so happy to learn 
  like this yes i wil defineltly learn thsi way tahnk you and signing of

