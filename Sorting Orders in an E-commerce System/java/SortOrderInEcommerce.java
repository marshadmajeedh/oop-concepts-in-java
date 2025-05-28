import model.Order;
import print.PrintArray;
import sort.QuickSort;

public class SortOrderInEcommerce {
    public static void main(String[] args) {

        Order[] orders = new Order[5];

       orders[0] = new Order("ORD1","Marshad");
       orders[1] = new Order("ORD2","James");
       orders[2] = new Order("ORD3","John");
       orders[3] = new Order("ORD4","Mary");
       orders[4] = new Order("ORD5","Jumbo");

       orders[0].setTotalAmount(100);
       orders[1].setTotalAmount(400);
       orders[2].setTotalAmount(200);
       orders[3].setTotalAmount(500);
       orders[4].setTotalAmount(300);

       System.out.println ("Before sorting: ");
       PrintArray.printArray(orders);

        QuickSort.quickSort(orders, 0, orders.length - 1);
       System.out.println ("\nAfter sorting: ");
       PrintArray.printArray(orders);

    }
}
