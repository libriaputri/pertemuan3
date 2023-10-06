/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author WINDOWS 10
 */
public class contohProsedur {
    int alas = 5;
    int tinggi = 7;
    
    
    void hitungLuasJajargenjang (){
        int luas = alas * tinggi ;
        System.out.println ( "alas = " + alas);
        System.out.println ("tinggi = " + tinggi);
        System.out.println ( "luas = " + luas);
    }
    
    public static void main (String [] args) {
        contohProsedur p = new contohProsedur();
        p.hitungLuasJajargenjang();
    }
}
