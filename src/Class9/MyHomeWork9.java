package Class9;

public class MyHomeWork9 {
    public static void main(String[] args) {
        grade(52, 75);

        titleCase("hapPY pEace");

        numbsOfWord("happy peace joy programmer");
    }

    public static void titleCase(String sentence1) {

        System.out.println(sentence1);
        String[] sentence1Array = sentence1.split(" ");
        sentence1 = "";
        for (int i = 0; i < sentence1Array.length; i++) {
            sentence1 = sentence1 + sentence1Array[i].substring(0, 1).toUpperCase() + sentence1Array[i].substring(1).toLowerCase() + " ";
        }
        sentence1 = sentence1.trim();
        System.out.println(sentence1);

    }

    public static void grade(double studentScore, double maxScore) {

        double percentage = (studentScore * 100) / maxScore;

        if (50.00 >= percentage) {
            System.out.println("Grade F");
        } else if (51.00 <= percentage && percentage <= 60.00) {
            System.out.println("Grade E");
        } else if (61.00 <= percentage && percentage <= 70.00) {
            System.out.println("Grade D");
        } else if (71.00 <= percentage && percentage <= 80.00) {
            System.out.println("Grade C");
        } else if (81.00 <= percentage && percentage <= 90.00) {
            System.out.println("Grade B");
        } else if (91.00 <= percentage && percentage <= 100.00) {
            System.out.println("Grade A");
        }
    }

    public static void numbsOfWord(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        int sentenceArraylength = sentenceArray.length;
        System.out.println(sentenceArraylength);
    }

/*public static int [] reverseNum (int [] nums ) {

    for (int i = 0; i < nums.length; i++) {
        int rev = nums[i];
        nums[i] = nums[nums.length - i];

    }
}

*/




    }


