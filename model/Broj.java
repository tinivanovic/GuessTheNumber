/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.veleri.broj.model;

/**u klasi Broj smo imenovali int varijable zeljeniBroj, randomBroj, pokusaj. 
 * Takoder smo kreirali odgovarajuce gettere i settere, te za zeljeniBroj konstruktor.
 *
 *
 * @author Tin Ivanovic
 */
public class Broj {
    private int zeljeniBroj;
    private int randomBroj;
    private int pokusaj;

    public int getBrojac() {
        return brojac;
    }

    public void setBrojac(int brojac) {
        this.brojac = brojac;
    }
    private int brojac;
    
    public Broj(int zeljeniBroj) {
        this.zeljeniBroj = zeljeniBroj;
    }

    
    

    public int getZeljeniBroj() {
        return zeljeniBroj;
    }

    public void setZeljeniBroj(int zeljeniBroj) {
        this.zeljeniBroj = zeljeniBroj;
    }

    public int getRandomBroj() {
        return randomBroj;
    }

    public void setRandomBroj(int randomBroj) {
        this.randomBroj = randomBroj;
    }

    public int getPokusaj() {
        return pokusaj;
    }

    public void setPokusaj(int pokusaj) {
        this.pokusaj = pokusaj;
    }
    
    
}
