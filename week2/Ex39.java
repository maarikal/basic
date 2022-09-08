package week2;

public class Ex39 {
    private static void printStars(int amount) {
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int times = 1;
        while(true){
            System.out.print("*");
            if(times ==amount) {
                break;
            }
            times++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

}
