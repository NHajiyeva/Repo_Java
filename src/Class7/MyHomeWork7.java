package Class7;

import java.util.Arrays;
import java.util.Locale;

public class MyHomeWork7 {
    public static void main(String[] args) {

        String sentence1 = "hapPY nEW yeAr";
        System.out.println(sentence1);
        String sentence2 = sentence1.toLowerCase(Locale.ROOT);
        String[] sentence2split = sentence2.split(" ");
        String finalString = " ";


        for (int i = 0; i < sentence2split.length; i++) {
            String str = sentence2split[i];
            String cap = finalString.substring(0, 1).toUpperCase() + str.substring(0);
            finalString = finalString + cap + " ";

        }
        System.out.println(finalString);


        String sentence3 = "Lab sessIONS clAsses";
        String sentence3Up = sentence3.toUpperCase(Locale.ROOT);
        String[] sentence3Split = sentence3Up.split(" ");
        System.out.println(Arrays.toString(sentence3Split));


        for (int count = 0; count < sentence3Split.length; count++) {
            String str = sentence3Split[count];
            System.out.println(str.charAt(0));







            //String[] threeWordsArray = threeWords.split(" ");
            //
            //        for(String word : threeWordsArray) {
            //            acronym.append( word.substring(0, 1) );

        }




    }

}
