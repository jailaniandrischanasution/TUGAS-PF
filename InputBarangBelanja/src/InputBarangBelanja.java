import java.util.Scanner;

public class InputBarangBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] jumlahBelanja = new int[5];
        int[] hargaPerItem = {2500, 3000, 4000, 5000, 6000};

        for (int i = 0; i < 5; i++) {
            System.out.print("Jumlah belanja item-" + i + " Rp " + hargaPerItem[i] + ": ");
            jumlahBelanja[i] = scanner.nextInt();
        }

        System.out.println("Daftar belanja dan harga:");

        int totalItemBelanja = 0;
        int totalBelanja = 0;
        for (int i = 0; i < 5; i++) {
            int harga = jumlahBelanja[i] * hargaPerItem[i];
            totalItemBelanja += jumlahBelanja[i];
            totalBelanja += harga;
            System.out.println("Harga barang ke-" + i + ", " + hargaPerItem[i] + ", " + jumlahBelanja[i] + " item: " + harga);
        }

        System.out.println("TOTAL ITEM BELANJA: " + totalItemBelanja);
        System.out.println("TOTAL BELANJA: Rp " + totalBelanja);
        System.out.println("Process finished with exit code 0");
    }
}
