package Orders;

public enum Status {

    PLACED("order placed"),
    PICKED("order picked"),
    DISPATCHED("order dispatched"),
    DELIVERED("order delivered");

    private String update;
    private Status(String update) {
        this.update = update;
    }
    public String getUpdate() {
        return update;
    }
}
