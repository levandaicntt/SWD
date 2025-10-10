class Invoice {
    private double amount;
    private String customerName;

    public Invoice(double amount, String customerName) {
        this.amount = amount;
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }
}

class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Hóa đơn cho " + invoice.getCustomerName() + ": $" + invoice.getAmount());
    }
}

class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Đang lưu hóa đơn vào cơ sở dữ liệu...");
    }
}
