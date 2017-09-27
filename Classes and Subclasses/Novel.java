/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class Novel extends Book {
    int markupPercentage;
    String type;


    /**
     * @param title
     * @param price
     * @param type
     * @param markupPercentage
     */
    public Novel(String title, double price, String type, int markupPercentage) {
        super(title, price);
        this.markupPercentage = markupPercentage;
        this.type = type;
    }

    public double getMarkupPercentage() {
        return markupPercentage;
    }

    public String getType() {
        return type;
    }

    /**
     * Calculating the actual price of Novel
     *
     * @return
     */
    public double actualPrice() {
        return super.price + ((super.price * this.markupPercentage) / 100);
    }


    /**
     * setting the new markupPercentage
     *
     * @param markupPercentage
     */
    public void setMarkupPercentage(int markupPercentage) {
        this.markupPercentage = markupPercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Novel novel = (Novel) o;

        return type.equals(novel.type);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                " markupPercentage=" + markupPercentage +
                ", type='" + type;
    }
}
