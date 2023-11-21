import java.util.Scanner;

public class TebakPin{
    public static void main(String[] args) {
        // Menentukan PIN 4 digit
        String pinToGuess = "2106";

        // Batas maksimum tebakan
        int maksimumTebakan = 3;
        int tebakan = 0;

        Scanner input = new Scanner(System.in);

        while (tebakan < maksimumTebakan) {
            System.out.print("Masukkan tebakan PIN 4 digit: ");
            String tebakanSaatIni = input.next();

            // Periksa apakah tebakan benar
            if (tebakanSaatIni.equals(pinToGuess)) {
                System.out.println("Selamat, Anda berhasil menebak PIN: " + pinToGuess);
                break;
            } else {
                System.out.println("Tebakan salah. Anda memiliki " + (maksimumTebakan - (tebakan + 1)) + " percobaan tersisa.");
            }

            tebakan++;
        }

        if (tebakan == maksimumTebakan) {
            System.out.println("Anda kalah. PIN yang benar adalah: " + pinToGuess);
        }

        input.close();
    }
}