public class Examen {
    //2
    public char[] stringToCharArray(String text) {
        char[] chars = new char[text.length()];
        String textMin = text.toLowerCase();
        for (int i = 0; i < textMin.length(); i++) {
            chars[i] = textMin.charAt(i);
        }
        return chars;
    }
    //3
    public void printArray(char[] array){
        for (int i=0; i< array.length;i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }


}
