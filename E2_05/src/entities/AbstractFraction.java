/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author AnhVuNAV
 */
public abstract class AbstractFraction {

    private int numer;
    private int denom;

    public AbstractFraction() {
    }

    public AbstractFraction(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "AbstractFraction[" + numer + "/" + denom + ']';
    }

    public abstract AbstractFraction add(AbstractFraction f);

    public abstract AbstractFraction minus(AbstractFraction f);

    public abstract AbstractFraction time(AbstractFraction f);

    public abstract AbstractFraction div(AbstractFraction f);

    public abstract AbstractFraction simplify();

}
