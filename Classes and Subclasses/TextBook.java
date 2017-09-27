/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class TextBook extends Book {
    String field;
    int discount;

    /**
     * @param title
     * @param price
     * @param field
     * @param discount
     */
    public TextBook(String title, double price, String field, int discount) {
        super(title, price);
        this.discount = discount;
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * Calculating the actual price of TextBook
     *
     * @return
     */
    public double actualPrice() {
        return super.price - ((super.price * this.discount) / 100);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        TextBook textBook = (TextBook) o;

        return field.equals(textBook.field);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + field.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Field:" + field + ", Discount:" + discount;
    }
}
