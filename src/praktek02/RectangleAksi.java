package praktek02;
public class RectangleAksi {
    public static void main(String[] args) {
        
        Rectangle r1  = new Rectangle();
        
        r1.panjang = 10;
        r1.lebar = 20;
        
        r1.cetakInfo();
        System.out.println("Luas rectangle = "+r1.hitungLuas());
        r1.cetakLuas();
    }

}
