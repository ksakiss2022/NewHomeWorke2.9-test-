package HomeWorke2_8;

import java.util.ArrayList;
import java.util.List;


public class Bubls {
    public static void main(String[] args) {
        example();
    }

    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {

                biDemArrList.get(i).add(j,((i + j) % 2 == 1?"х" : "◯"));
                        }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}