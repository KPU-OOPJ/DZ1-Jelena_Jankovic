/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author korisnik
 */
public class niz {
    static void parniNeparni (int n[], int m) {     
        
       int k = -1, temp;    //deklarisanje promenjivih
       for (int i=0 ; i < n.length ; i++) {    
           if (n[i]%2==0) {   //uslov za proveravanje parnog broja
               k++;      //uzimanje narednog clana niza
               
               temp = n[i];   //zamena elemenata
               n[i] = n[k];   
               n[k] = temp;   
           }
       }
    }
    
}
