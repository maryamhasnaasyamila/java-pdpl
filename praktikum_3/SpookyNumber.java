import java.util.Scanner;

public class SpookyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, kelas;
        int nim, floor;

        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("NIM: ");
        nim = input.nextInt();
        System.out.print("Kelas: ");
        kelas = input.nextLine();
        System.out.print("Floor: ");
        floor = input.nextInt();


        int actualFloor;
        if (floor > 13) {
            actualFloor = floor - 1;
        } else {
            actualFloor = floor;
        }
        System.out.println("Actual Floor: " + actualFloor);
        // System.out.println("Nama: Maryam Hasnaa' Syamila");
        // System.out.println("Kelas: TI03 - SE02");
        // System.out.println("NIM: 0110222067");
    }
}
