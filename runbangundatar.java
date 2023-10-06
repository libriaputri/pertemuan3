/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author WINDOWS 10
 */
public class runbangundatar {
        public static void main (String [] args) {

            masterbangundatar F = new masterbangundatar();
            System.out.println("Hasil method prosedur dengan parameter ");
            F.hitungluasjajargenjang(5, 7);
            
            System.out.println("\nHasil method fungsi dengan parameter");
            System.out.println("luas jajargenjang = " + F.luasjajargenjang(2, 5));
            
            System.out.println("\nHasil method static prosedur ");
            masterbangundatar.hitungjajargenjang(2, 6);
            
            System.out.println("\nHasil method static fungsi ");
            System.out.println("Luas jajargenjang = "+ masterbangundatar.hitungjajargenjangluas(5, 3));
        }
  
}
