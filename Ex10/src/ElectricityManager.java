import java.util.ArrayList;

public class ElectricityManager {
    private ArrayList<khachHang> customers;

    public ElectricityManager() {
        customers = new ArrayList<khachHang>();
    }

    public void addCustomer(khachHang customer) {
        customers.add(customer);
    }

    public void deleteCustomer(String meterCode) {
        for (khachHang customer : customers) {
            if (customer.getElectricityMeterCode().equals(meterCode)) {
                customers.remove(customer);
                break;
            }
        }
    }

    public void editCustomer(String meterCode, String fullName, String address) {
        for (khachHang customer : customers) {
            if (customer.getElectricityMeterCode().equals(meterCode)) {
                customer.setFullName(fullName);
                customer.setAddress(address);
                break;
            }
        }
    }

    public ArrayList<khachHang> getCustomers() {
        return customers;
    }
}
