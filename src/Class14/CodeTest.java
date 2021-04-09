package Class14;

public class CodeTest {

    public void removeArray (int[] givenArray, int givenValue) {

        int emptyArray;
        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] != givenValue) {
                emptyArray = givenArray [i];
                System.out.println(emptyArray);
            } else {
                System.out.println(givenArray);
            }
        }
    }

    public void trafficTicket(int speed) {
        int points = (speed - 70) / 5;
        if (speed <= 74) {
            System.out.println("Thank you for driving within the speed limit");
        } else if (points >= 12) {
            System.out.println( points + " points. License is suspended");
        } else if (speed > 74) {
        System.out.println(points + "points");
    }
}
}








