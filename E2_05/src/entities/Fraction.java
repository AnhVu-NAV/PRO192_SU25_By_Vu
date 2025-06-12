/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author AnhVuNAV
 */
public class Fraction extends AbstractFraction{

    public Fraction() {
    }

    public Fraction(int numer, int denom) {
        super(numer, denom);
    }

    @Override
    public AbstractFraction add(AbstractFraction f) {
        int tu = super.getNumer()*f.getDenom() + super.getDenom() * f.getNumer();
        int mau = super.getDenom()*f.getDenom();
        return new Fraction(tu, mau);
    }

    @Override
    public AbstractFraction minus(AbstractFraction f) {
        int tu = super.getNumer()*f.getDenom() - super.getDenom() * f.getNumer();
        int mau = super.getDenom()*f.getDenom();
        return new Fraction(tu, mau);
    }

    @Override
    public AbstractFraction time(AbstractFraction f) {
        int tu = super.getNumer() * f.getNumer();
        int mau = super.getDenom() * f.getDenom();
        return new Fraction(tu, mau);
    }
    
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    @Override
    public AbstractFraction div(AbstractFraction f) {
        int tu = super.getNumer() * f.getDenom();
        int mau = super.getDenom() * f.getNumer();
        return new Fraction(tu, mau);
    }

    @Override
    public AbstractFraction simplify() {
        int gcd = this.gcd(super.getNumer(), super.getDenom());
        int tu = super.getNumer()/gcd;
        int mau = super.getDenom()/gcd;
        return new Fraction(tu, mau);
    }
    
}
