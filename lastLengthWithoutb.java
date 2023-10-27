public class lastLengthWithoutb {
    public static void main(String[] args) {
        String word="Червяк";
        char lastLetter=word.charAt(word.length()-1);
        char myak='ь';


        if (lastLetter != myak){
            lastLetter=word.charAt(word.length()-1);
        } else {
            lastLetter=word.charAt(word.length()-2);
        }
        System.out.println(lastLetter);
    }
}
