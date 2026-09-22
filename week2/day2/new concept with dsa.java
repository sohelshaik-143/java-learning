here today i have learn about constructors and related stuff and now i have done the dsa problem

  here we found that like target elemnt found are not with this code
  class Main {
    public static void main(String[] args) {
        int[] marks = {10, 28, 25, 65, 89, 10};
        
        // Pass the entire array to the method. 
        // We don't wrap it in System.out.println because the method handles the printing itself.
        int target=10;
        su(marks,target); 
    }
    
    public static int su(int[] marks,int target) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]==target) {
                System.out.println(target  +  "found"+  i);
            }
        }
        // Removed "return 0;" because the method return type is void
        return 0;
    }
}

here we have the compexity analysis means we are traversing this loop for n times it consists of space complexity by O(n) times and space will get 
one return type so O(1) times

supporting problems 


#1.search and return bolean 
// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        int[] marks = {10, 28, 25, 65, 89, 10};
        
        // Pass the entire array to the method. 
        // We don't wrap it in System.out.println because the method handles the printing itself.
        int target=10;
        su(marks,target); 
    }
    
    public static boolean su(int[] marks,int target) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]==target) {
                System.out.println("true");
            }
        }
        // Removed "return 0;" because the method return type is void
        return false;
    }
}


#2.first occurance

// Online Java Compiler (Editor)
// Write and run Java online using this editor.

  class Main {
    public static void main(String[] args) {
        int[] marks = {10, 28, 25, 65, 89, 10};
        
        // Pass the entire array to the method. 
        // We don't wrap it in System.out.println because the method handles the printing itself.
        int target=10;
        su(marks,target); 
    }
    
    public static int su(int[] marks,int target) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]==target && marks[i]!=marks.length-1) {
                System.out.println(target  + "-->"+ "found"+ "-->"+ i);
                return i;
            }
        }
        // Removed "return 0;" because the method return type is void
        return 0;
    }
}

#3.first occurance

// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        int[] marks = {10, 10, 10, 65, 89, 1};
        int target = 10;
        
        // We catch the returned count and store it in a variable
        int totalMatches = su(marks, target); 
        System.out.println("Total times target appeared: " + totalMatches);
    }
    
    public static int su(int[] marks, int target) {
        int count = 0;
        
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == target) {
                count++; // Increment count when a match is found
            }
        }
        
        // Return the actual calculated count instead of -1
        return count; 
    }
}

#4.last occurrance 

// Online Java Compiler (Editor)
// Write and run Java online using this editor.

  class Main {
    public static void main(String[] args) {
        int[] marks = {10, 28, 25, 65, 89, 10};
        
        // Pass the entire array to the method. 
        // We don't wrap it in System.out.println because the method handles the printing itself.
        int target=10;
        su(marks,target); 
    }
    
    public static int su(int[] marks,int target) {
        for (int i = marks.length-1;i>=0; i--) {
            if (marks[i]==target ) {
                System.out.println(target  + "-->"+ "found"+ "-->"+ i);
                return i;
            }
        }
        // Removed "return 0;" because the method return type is void
        return 0;
    }
}

all of the problems has o(n) time complexity and O(1) spacee complexity 
