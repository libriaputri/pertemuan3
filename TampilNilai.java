/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author WINDOWS 10
 */
public class TampilNilai {
    public static void main(String[] args) {
        MasterNilai M = new MasterNilai();
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        
        //prosedur
        System.out.println("\t\tHasil Nilai Kelulusan");
        M.nilailulus("Libria Putri", 90);
        System.out.println("=====================================");
        
        //fungsi
        System.out.println("\t\tHasil Nilai Kelulusan");
        M.nilailulusan("Libria Putri", 98, "");
        System.out.println("=====================================");
        
        //prosedur
        System.out.println("\t\tHasil Nilai Kelulusan");
        MasterNilai.hasilkelulusan("Libria Putri", 89);
        System.out.println("=====================================");
        
        //fungsi
        System.out.println("\t\tHasil Nilai Kelulusan");
        MasterNilai.nilaikelulusan("Libria Putri", 96, "");
        System.out.println("=====================================");
    }
  
}
