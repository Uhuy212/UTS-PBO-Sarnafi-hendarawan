
package soal.nomber.pkg2;

/**
 *
 * @author sarnafi hendrawan
 * NIM: A22100123
 */
public class SoalNomber2 {
    public static void main(String[] args) {
     int  nilai = 80;
     int absen = 30;
        
        boolean lulusNilai = nilai >= 75;
        boolean lulusAbsen = absen >= 75;
        
        boolean lulus = lulusNilai && lulusAbsen; 
        
         if (nilai >=75 && absen <= 75) {
            System.out.println("selamat anda lulus");
    }else {
     System.out.println("silahkan coba tahun depan");       
        }
    if (nilai >= 80 && absen >= 80){
        System.out.println("nilai anda A"); 
    }else if (nilai >= 70 && absen >= 70 ) {
        System.out.println("nilai anda B");
    }else if (nilai >= 60 && absen >= 60 ) {
        System.out.println("nilai anda C");
    }else if (nilai >= -50 && absen >= -50 ) {
        System.out.println("nilai anda D");
    }else{
        System.out.println("nilai anda E");
    }
    }
        
    
}