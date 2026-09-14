largest of three numbers
  class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        int c = 5;

        int largestab;
        if (a > b) {
            largestab = a;
        } else {
            largestab = b;
        }

        int largest;
        if (largestab > c) {
            largest = largestab;
        } else {
            largest = c;
        }

        System.out.println("The largest value is: " + largest);
    }
}
