package sort;

import model.Order;

public class Partition {
    public static int partition(Order[] orders,int left,int high) {

        double pivot = orders[high].getTotalAmount();
        int leftPointer = left - 1;

        for (int i = left; i < high; i++) {

            if (orders[i].getTotalAmount() >= pivot) {

                leftPointer++;//1,4,2,5,3, //4,1,2,5,3 //4,5,3,2,1
                Order tempOrder = orders[i];
                orders[i] = orders[leftPointer];
                orders[leftPointer] = tempOrder;
            }
        }
        leftPointer++;
        Order tempOrder = orders[leftPointer];
        orders[leftPointer] = orders[high];
        orders[high] = tempOrder;

        return leftPointer;
    }
}
