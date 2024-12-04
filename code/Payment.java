public abstract class Payment {
    protected float amount;

    // Constructor
    public Payment(float amount) {
        this.amount = amount;
    }

    // Getter dan Setter
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
