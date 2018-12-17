/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.veleri.broj.controll;
import hr.veleri.broj.model.Broj;
import java.util.Random;
/**
 * Importali smo model koji smo prije izradili i java.util.Random.
 *
 * @author Tin Ivanovic
 */
public class BrojController {
    /**Metoda kreirajBroj uzima parametar zeljeniBroj, kreira objekt klase Broj, te ga vraca naredbom return*/
    public Broj kreirajBroj(int zeljeniBroj){
        Broj broj = new Broj(zeljeniBroj);
        
        return broj;
    }
    
    /**metoda generirajBroj uzima kao parametar objekt klase Broj, uzima zeljeniBroj,
    kreira novi objekt x klase Random, inicijalizira random broj te pomocu x.nextInt 
    funkcije određuje raspon brojeva koji je određen vrijednosti varijable zeljeniBroj,
     na kraju taj random broj se uvrsti u varijablu randomBroj naredbom set
    */
public void generirajBroj(Broj broj){
    
    int zeljeniBroj = broj.getZeljeniBroj();
    Random x = new Random();
    int random = x.nextInt(zeljeniBroj+1);
    broj.setRandomBroj(random);
} 

    
/**
Metoda provjera je povratna metoda koja vraca String, a kao argument uzima objekt
klase Broj, u njoj smo inicijalizirali String ispis, te otvorili for petlju koja 
određuje da se petlja vrti dokle god je varijabla i manja od varijable brojac. 
Ukoliko uneseni broj varijable pokusaj bude veci od vrijednosti varijable random broj
ispise se odredena poruka, isto tako ukoliko je manji. Kada su brojevi isti petlja zavrsava.
*/
public String provjera(Broj broj){
    String ispis="";
     
        if(broj.getPokusaj()>broj.getRandomBroj())
        {   
           
            ispis = "\nVas broj je kriv!\nUnjeli ste prevelik broj!"
                    + "\nPokusajte ponovo!";
        }
        else if(broj.getPokusaj()<broj.getRandomBroj())
        {   
            
               ispis = "\nVas broj je kriv!\nUnjeli ste premalen broj! \nPokusajte ponovo!";
        }
        else
        {
            ispis = "\nVas broj je tocan! Cestitam!";
            
        }   
    
    return ispis;
}
    
    

    
}
