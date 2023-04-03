public class Main {
    public static void main(String[] args) {
        // Create a new ElectricityManager object
        ElectricityManager manager = new ElectricityManager();

        // Create some new CustomerHang objects and add them to the manager
        khachHang customer1 = new khachHang("John Doe", "123 Main St", "ABC123");
        manager.addCustomer(customer1);

        khachHang customer2 = new khachHang("Jane Smith", "456 Oak Ave", "DEF456");
        manager.addCustomer(customer2);

        // Print out the list of customers
        System.out.println("List of customers:");
        for (khachHang customer : manager.getCustomers()) {
            System.out.println(customer);
        }
        System.out.println();

        // Delete a customer from the manager
        manager.deleteCustomer("DEF456");

        // Print out the updated list of customers
        System.out.println("List of customers after deleting DEF456:");
        for (khachHang customer : manager.getCustomers()) {
            System.out.println(customer);
        }
        System.out.println();

        // Edit a customer in the manager
        manager.editCustomer("ABC123", "John Smith", "123 Main St Apt 2");

        // Print out the updated list of customers
        System.out.println("List of customers after editing ABC123:");
        for (khachHang customer : manager.getCustomers()) {
            System.out.println(customer);
        }
        System.out.println();

        // Create a new BienLai object and set the old and new indices
        BienLai bill = new BienLai(customer1, 1000, 1500);

        // Calculate the electricity bill and print it out
        int amountToBePaid = bill.calculateElectricityBill();
        System.out.println("Amount to be paid by " + customer1.getFullName() + ": " + amountToBePaid);
    }
}
