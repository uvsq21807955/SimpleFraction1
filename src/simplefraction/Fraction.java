/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplefraction;

/**
 *
 * @author USER
 */
public class Fraction {
    
    private int Denominateur,Nominateur;
    
    public Fraction(){}
    public Fraction(int n,int d)
    {
        this.Nominateur=n;
        this.Denominateur=d;
    }
    
    @Override
    public String toString()
    {
        return this.Nominateur+"/"+this.Denominateur;
    }
    
}
