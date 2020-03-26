/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;
import static newpackage.niz.parniNeparni;

/**
 *
 * @author korisnik
 */
public class main {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);    //definisanje skenera za m
        System.out.println ("Unesi element: ");    //ispis koliko elemenata niza unosimo
        
        int m = input.nextInt();    //definisanje clanova i duzine niza
        int[] n = new int [m];     //definisanje niza
        Scanner in = new Scanner (System.in);    //definisanje skenera za n 
        for (int i=0 ; i<n.length ; i++){    //for petlja za n niz da ni ispisao elemente niza
            System.out.println("Unesite elemente niza: ");    //ispis da korisnika uputimo sta treba da unese
            n[i] = in.nextInt();    
        }
          parniNeparni (n,m);  //pozivanje metode
           
           for(int c=0 ; c<n.length ; c++)    //prebrojavanje clanova niza
               System.out.print(n[c]+"");     //ispis 
    }
}           
