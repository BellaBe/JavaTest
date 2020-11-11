public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (x < 10) {
            while (y < 10) {
                System.out.println(x + " x " + y + " = " + (x * y));
                y++;
            }
            x++;
            y = 1;
        }
    }
}