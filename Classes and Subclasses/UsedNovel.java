/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mudassar
 */
public class UsedNovel extends Novel {
    int yearOld;

    /**
     * @param title
     * @param price
     * @param type
     * @param markupPercentage
     * @param yearOld
     */
    public UsedNovel(String title, double price, String type, int markupPercentage, int yearOld) {
        super(title, price, type, markupPercentage);
        this.yearOld = yearOld;
    }

    /**
     * Calculating the actual price  of UsedNovel
     *
     * @return
     */
    public double actualPrice() {
        double price = 0.0;
        if (this.yearOld < 5) {
            price = super.actualPrice() - super.actualPrice() * 5 / 100;
        } else if (this.yearOld < 10 && this.yearOld > 5) {
            price = super.actualPrice() - super.actualPrice() * 10 / 100;
        } else {
            price = super.actualPrice() - super.actualPrice() * 15 / 100;
        }
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UsedNovel usedNovel = (UsedNovel) o;

        return this.actualPrice() == usedNovel.actualPrice();

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + yearOld;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Year Old:" + yearOld;
    }
}