import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Main {

    static String[] wordsData = {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"};

    public static String[] reverse( String[] words ){

        String[] result = new String[words.length];
        String oneWord = Arrays.stream(words).collect(joining());
        StringBuilder wordSB = new StringBuilder(oneWord);
        char[] reverseletters = wordSB.reverse().toString().toCharArray();

        int f=0;
        for(int l =0; l<words.length; l++){
            String tempString = "";
            for(int s =0; s<words[l].length(); s++){
                tempString = tempString + reverseletters[f];
                f++;
            }
            result[l] = tempString;
        }
    return result;
    }

    public static void main(String[] args) {
        String[] res = reverse(wordsData);
        for( int u = 0 ; u<res.length; u++ ){
            System.out.println( res[u]   );
        }
    }
}
