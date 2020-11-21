public class SpaceTraining {

    public void whileExample(){
        int x = 1;
        int y = 1;
        while (x < 10) {
            while (y <= 10) {
                System.out.print(y + " x " + x + " = " + (x * y) + "    ");
                if(x * y < 10){
                    System.out.print(" ");
                }
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }

    public void forExample(){
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print( i + " * " + j + " = " + i * j + "   ");
                if(i * j < 10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
