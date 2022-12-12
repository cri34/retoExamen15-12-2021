public class Examen {
    char[] delimitor = stringToCharArray(" -,.!?'");

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
    public void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    //4
    public boolean isIndexDelimitor(char[] chars, int index) {
        for (int i = 0; i < delimitor.length; i++) {
            if (chars[index] == delimitor[i])
                return true;
        }
        return false;
    }

    //5
    public boolean isPrincipioPalabra(char[] chars, int index) {
        if (index >= chars.length || isIndexDelimitor(chars, index))
            return false;

        return index == 0 || isIndexDelimitor(chars, index - 1);
    }

    //6
    public int returnLenghtWord(char [] chars, int index){
        int lenght = 0;
        for (int i = index ; i < chars.length; i++){
            if (isIndexDelimitor(chars, i))
                break;
            lenght++;
        }
     return lenght;
    }
}
