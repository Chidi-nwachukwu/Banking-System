public class Bank {
    private long numberOfCustomers;
    private String bankName;


    public Bank(long numberOfCustomers, String bankName) {
        this.numberOfCustomers = numberOfCustomers;
        if(numberOfCustomers < 0){
            throw new IllegalArgumentException("Bank cannot have this number of customers");
        }
        this.bankName = bankName;
    }

    public Bank(String bankName) {
        this(0, bankName);
    }

    public Bank() {
        this(0, null);
    }

    public long getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(long numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}
