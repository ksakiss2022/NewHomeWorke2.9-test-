package HomeWorke2_9;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private static Set<String> setForMultiplication = new HashSet<>();

    public static String taskПenerator() {
        int theFirstMultiplier;
        int theSecondeMultiplier;
        Random ran = new Random();
        theFirstMultiplier = ran.nextInt(9);
        theSecondeMultiplier = ran.nextInt(9);
        return theFirstMultiplier + "*" + theSecondeMultiplier;
    }

    public static void main(String[] args) {
        int count = 0;
        while (count < 15) {
            String pairNumber = taskПenerator();
            String inverseNumber = pairNumber.charAt(2) + "*" + pairNumber.charAt(0);
            if (!setForMultiplication.contains(pairNumber) && !setForMultiplication.contains(inverseNumber)) {
                setForMultiplication.add(pairNumber);
                count++;
            }
        }
        System.out.println(setForMultiplication);

    }

}

