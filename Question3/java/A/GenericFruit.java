package A;

import java.util.ArrayList;

public class GenericFruit {

    public static void ShowElement(ArrayList<Apple> apples, ArrayList<Grape> grapes) {

        System.out.println("Apples Details->");
        for (Apple a : apples){

            System.out.println(a.displayFruitDetails());
        }
        System.out.println();
        System.out.println("Grapes Details->");
        for (Grape g : grapes){
            System.out.println(g.displayFruitDetails());
        }
        System.out.println();
    }
}
