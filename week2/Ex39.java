package week2;

public class Ex39 {
    private static void printStars(int amount) {
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int times = 1;
        while(times <= amount){
            System.out.print("*");
            times++;
        }
        System.out.println();
    }

    private static void printSquare (int sideSize) {
        int row = 1;
        while (row <= sideSize) {
            int field = 1;
            while(field <= sideSize) {
                System.out.print("* ");
                field++;
            }
            System.out.println();
            row++;
        }
    }

    private static void printTriangle(int size) {
        int row = 1;
        while (row <= size) {
            int field = 1;
            while (field <= row) {
                System.out.print("*");
                field++;
            }
            System.out.println();
            row++;
        }
    }


    private static void printRectangle(int width, int height){
        int row = 1;
        while (row <= height) {
            int field = 1;
            while (field <= width) {
                System.out.print("*");
                field++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
        System.out.println("----Exercise 39.1-----");
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("-----Exercise 39.2-----");
        printSquare(4);

        System.out.println("-----Exercise 39.3------");
        printRectangle(17,3);

        System.out.println("-----Exercise 39.4----");
        printTriangle(4);
    }
}
