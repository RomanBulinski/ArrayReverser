import java.util.Arrays;
import java.util.List;

public class Main {

    static String[] wordsData = {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"};
    String[] tempoutput = {"I", "like"};

    public static String[] reverse( String[] words ){

        String[][] tempResult = new String[words.length][];
        String oneWord = "";
        String[] result = new String[words.length];
        for(int i =0; i<words.length; i++){
//            System.out.println(words[i].length());
            tempResult[i] = new String[words[i].length()];
            oneWord = oneWord+words[i];
        }
        char[] letters = oneWord.toCharArray();
        char[] reverseletters = new char[letters.length];
        int z=0;
        for(int j=letters.length-1; j>=0; j--){
            reverseletters[z] = letters[j];
            z++;
        }
//        for(int k =0; k<reverseletters.length; k++){
//            System.out.print(reverseletters[k]);
//        }

        int f=0;
        for(int l =0; l<words.length; l++){
            String tempString = "";
            for(int s =0; s<words[l].length(); s++){
                tempResult[l][s]=String.valueOf(reverseletters[f]);
                f++;
                tempString = tempString + tempResult[l][s];
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
