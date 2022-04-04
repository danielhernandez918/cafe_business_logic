import java.util.ArrayList;
// import java.util.Scanner;  
public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        // int numWeeks = 10;
        // Scanner sc= new Scanner(System.in); 
        // System.out.println("Please enter number of weeks for streak goal:");
        // int numWeeks = sc.nextInt();
        int week = 1;
        int drinks = 0;
        while (week <= numWeeks) {
            drinks+= (1*week);
            week++;
        }
        return drinks;
    }

    public double getOrderTotal(double[]prices) {
        double price = 0;
        for (int i = 0; i < prices.length; i++) {
            price += prices[i];
            // System.out.println(prices[i]);
            // System.out.println(price);
        }
        return price;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        // String name = menuItems.get(0);
        // System.out.println(name);
        // System.out.println(menuItems);
        // for (String item : menuItems) {
        //     System.out.println(item);
        // }
        for (int i =0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i) );
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are people " + customers.size() + " in front of you");
        customers.add(userName);
        System.out.println(customers);
    }
}
