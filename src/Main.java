public class Main {
    public static void main(String[] args) {
        ///exercise #1
        String name = "Bella";
        int count = 0;
        for (int i = 0; i < name.length() ; i++) {
            if(name.charAt(i) == 'l'){
                count++;
            }
        }
        System.out.println(count);

        ///exercise #2
        String word = "Bella";
        System.out.println(word);
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'l'){
                System.out.print('^');
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
        //exercise #3
        String workingWord = "information";
        for (int i = 0; i < workingWord.length(); i++) {
            if(i < 3){
                System.out.print(workingWord.charAt(i) + " ");
            }else if(i < workingWord.length() && i >= workingWord.length() - 3){
                System.out.print(workingWord.charAt(i) + " ");
            }
        }
    }
}