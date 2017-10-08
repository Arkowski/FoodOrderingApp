
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OrderList orderList = new OrderList();


        public int calculateBill (int tableId ) {
            int totalPrice = 0;
            for (Order order : orderList.getOrderList()) {
                if (order.getTableId() == tableId) {
                    billTotal += order.getPrice()
                }
            }
            return billTotal ;
        }

        System.out.println("Welcome to our restaurant");
        System.out.println("How can I help you?");
        System.out.println("(1) - Something to drink");
        System.out.println("(2) - Something to eat");
        System.out.println("(3) - That's all");
        System.out.println("(4) - END");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int userChoice = Integer.parseInt(string);
        switch (userChoice) {
            case 1:
        }
    }

}
