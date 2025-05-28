package sort;

import model.Order;

public class QuickSort {
    public static void quickSort(Order[]orders, int left, int right) {

        if (left < right) {

            int partitionIndex = Partition.partition(orders, left, right);
            quickSort(orders, left, partitionIndex - 1);
            quickSort(orders, partitionIndex + 1, right);
        }
    }
}
