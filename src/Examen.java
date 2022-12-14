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
        if (index < 0 || index >= chars.length)
            return lenght;

        for (int i = index ; i < chars.length; i++){
            if (isIndexDelimitor(chars, i))
                break;
            lenght++;
        }
     return lenght;
    }
    //7
    public String returnWord(char [] chars, int index){
         String word="";
         if ( index >= chars.length || index < 0 || !isPrincipioPalabra(chars,index))
             return word;

         for (int i = index; i < chars.length; i++){
             if (isIndexDelimitor(chars,i))
                 break;
             word += chars[i];
         }

         return word;
    }
    //8
    public boolean isPolindroma(String word){
        for (int i = 0; i < word.length() /2; i++){
            if (word.charAt(i) != word.charAt((word.length()-1)-i))
                return false;
        }
        return true;
    }
    //9
public int countPalindromas(char[] chars){
        int contador = 0;
        String word="";
        for (int i = 0; i < chars.length;i++){
           if (!isPrincipioPalabra(chars,i))
                continue;
           word = returnWord(chars,i);
           if (isPolindroma(word))
                contador++;
        }
        return contador;
}
    //10
    public String [] returnWordPalindromas(char [] chars){
        String [] palindromas= new String[countPalindromas(chars)];
        String word = "";
        int indPal=0;
        for (int i = 0; i < chars.length; i++){
            if (!isPrincipioPalabra(chars,i))
                    continue;
            word = returnWord(chars, i);
            if (isPolindroma(word))
                palindromas[indPal++] = word;
        }
        return palindromas;
    }
    //11
    public void printArray(String [] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(" " + array[i]);
        System.out.println();
    }
//abcde..
    //12
    public int [][] aparicionsSecChars(char [] chars) {
        final int abcLenght=26;
        char charAbc=(char) 97;
        int [][] apSecChars = new int[abcLenght][abcLenght];
        String combL="";
        for (int f = 0; f < abcLenght ; f++) {
            for (int s = 0; s < abcLenght ; s++) {
                for (int indCh = 0; indCh < chars.length-1; indCh++){
                    combL = "" + (char)(charAbc + f)  + "" + (char)(charAbc + s);
                    if ((chars[indCh] + "" + chars[indCh+1]).equals(combL)){
                        apSecChars[f][s] += 1;
                    }
                }
            }
        }
        return apSecChars;
    }
    //13
    public void printApSecChars(int [][] ApSecChars){
        final char firstAbc=(char)97;
        String combL="";
        final char abcLenght=26;
        for (int i =0; i < abcLenght;i++){
            for (int e =0; e < abcLenght; e++){
                combL = "" + (char)(firstAbc + i)  + "" + (char)(firstAbc + e);
                System.out.print(" |" + combL + " = " + ApSecChars[i][e]+"|");
            }
            System.out.println();
        }
    }
    //14
    public int returnIndMinLenght(String[] palindromas, int index){
        int minInd = index;
        for (int i = index; i < palindromas.length; i++){
            if (palindromas[i].length() < palindromas[minInd].length()){
                minInd = i;
            }
        }
        return minInd;
    }
    public String[] ordenarArrayStringLenght(String [] palindromas){
        String [] palOrd=new String [palindromas.length];
        int minInd;
        String temp="";
        for (int i=0; i < palindromas.length ; i++){
            palOrd[i]=palindromas[i];
        }
        for (int i = 0; i< palOrd.length;i++){
            minInd = returnIndMinLenght(palOrd,i);
            temp = palOrd[i];
            palOrd[i]= palOrd[minInd];
            palOrd[minInd] = temp;
        }
        return palOrd;
    }
}
