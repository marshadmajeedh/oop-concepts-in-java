package print;

import model.Order;

public class PrintArray {

    public static void printArray(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
