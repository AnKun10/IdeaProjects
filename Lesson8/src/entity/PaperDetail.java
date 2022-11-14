package entity;

public class PaperDetail {
    Paper paper;
    int quantity;

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "PaperDetail{" +
                "paper=" + paper +
                ", quantity=" + quantity +
                '}';
    }
}
