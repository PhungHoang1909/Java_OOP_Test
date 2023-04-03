public class khachHang {
    private String fullName;
    private String address;
    private String electricityMeterCode;

    public khachHang(String fullName, String address, String electricityMeterCode) {
        this.fullName = fullName;
        this.address = address;
        this.electricityMeterCode = electricityMeterCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getElectricityMeterCode() {
        return electricityMeterCode;
    }

    public void setElectricityMeterCode(String electricityMeterCode) {
        this.electricityMeterCode = electricityMeterCode;
    }

    @Override
    public String toString() {
        return fullName + " (" + address + ", " + electricityMeterCode + ")";
    }
}
