public class AppropriateClass {
    public static boolean isAppropriate(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
               int mirrorIndex = indexOfMirrorSymbol(charArray,i, ')');
               if(mirrorIndex==-1){
                   return false;
               }
                charArray[i]=0;
                charArray[mirrorIndex]=0;
            } else if (charArray[i] == ')'){
                return false;
            }
            if(charArray[i]=='"'){
                int mirrorIndex = indexOfMirrorSymbol(charArray,i,'"');
                if(mirrorIndex==-1){
                    return false;
                }
                charArray[i]=0;
                charArray[mirrorIndex]=0;
            }
            if(charArray[i]=='<'){
                int mirrorIndex = indexOfMirrorSymbol(charArray,i,'>');
                if(mirrorIndex==-1){
                    return false;
                }
                charArray[i]=0;
                charArray[mirrorIndex]=0;
            }else if (charArray[i] == '>'){
                return false;
            }
        }
        return true;
    }

    private static int indexOfMirrorSymbol(char[] array, int i, char symbol) {
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] == symbol) {
                return j;
            }
        }
        return -1;
    }
}


