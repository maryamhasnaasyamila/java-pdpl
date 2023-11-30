public class tugas {
    // mendefinisikan a, b, y, dan rumus c
    // tipe data int untuk bilangan bulat
    public static void main(String[] args) {
        double a, b, y;
        a = 1;
        b = 2;
        y = Math.toRadians(3); // Math to radians = agar nilai tidak berubah
    // tipe data double untuk bilangan desimal 8 bytes
        double c = (Math.sqrt(a*a + b*b - 2*a*b*Math.cos(y)));

    // variable instance
        System.out.println("Nama: Maryam Hasnaa' Syamila");
        System.out.println("NIM: 0110222067");
        System.out.println("Kelas: TI03 - SE02");
        System.out.println("Hasilnya adalah " + c);
    }
    
}
