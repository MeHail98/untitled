public class FirstVariant {
    public static boolean isAppropriate(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int mirrorIndex;
            if (charArray[i] == '(') {
                if ((mirrorIndex = indexOfMirrorSymbol(charArray, i, ')')) == -1) return false;
                charArray[mirrorIndex] = 0;
            }
            if (charArray[i] == '{') {
                if ((mirrorIndex = indexOfMirrorSymbol(charArray, i, '}')) == -1) return false;
                charArray[mirrorIndex] = 0;
            }
            if (charArray[i] == '[') {
                if ((mirrorIndex = indexOfMirrorSymbol(charArray, i, ']')) == -1) return false;
                charArray[mirrorIndex] = 0;
            }
            if (charArray[i] == ')' || charArray[i] == '}' || charArray[i] == ']') {
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


