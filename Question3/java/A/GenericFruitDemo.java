package A;

import java.util.ArrayList;

public class GenericFruitDemo {
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();
        ArrayList<Grape> grapes = new ArrayList<>();

        Apple a = new Apple("USA",450);
        Apple b = new Apple("Sri Lanka",150);
        apples.add(a);
        apples.add(b);

        Grape g1 = new Grape("China","Pink");
        Grape g2 = new Grape("Madolduwa","Rose");
        grapes.add(g1);
        grapes.add(g2);

        GenericFruit.ShowElement(apples, grapes);

    }
}
