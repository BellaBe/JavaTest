public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (x <= 10) {
            while (y <= 10) {
                System.out.print(y + " x " + x + " = " + (x * y) + "\t\t");
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }
}