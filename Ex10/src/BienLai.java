public class BienLai {
    private khachHang customer;
    private int oldIndex;
    private int newIndex;
    private int amountToBePaid;
    
    public BienLai(khachHang customer, int oldIndex, int newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }
    
    public BienLai(khachHang customer, int oldIndex, int newIndex, int amountToBePaid) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.amountToBePaid = amountToBePaid;
    }
    
    public khachHang getCustomer() {
        return customer;
    }
    
    public int getOldIndex() {
        return oldIndex;
    }
    
    public int getNewIndex() {
        return newIndex;
    }
    
    public int getAmountToBePaid() {
        return amountToBePaid;
    }
    
    public void setCustomer(khachHang customer) {
        this.customer = customer;
    }
    
    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }
    
    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }
    
    public void setAmountToBePaid(int amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }
    
    public int getElectricityUsage() {
        return newIndex - oldIndex;
    }
    
    public int calculateElectricityBill() {
        return (newIndex - oldIndex) * 5;
    }

}
