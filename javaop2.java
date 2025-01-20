// Bu işlem sayesinde kolayca faktöriyel hesaplamalarımızı yapabiliriz


package projeler;

import java.util.Scanner;

public class islem2 {
    public static void main(String[] args) {

        System.out.println("Hoş geldin! Bu yazılım sayesinde faktöriyel hesaplama yapabilirsin.\nLütfen aşağıya bir değer gir!");
        Scanner giris = new Scanner(System.in);
        System.out.print("Bir değer girin: "); // Klavyeden değer girmeyi atıyoruz
        int n = giris.nextInt();
        int t = 1;

        for (int i = 1; i <= n; i++) {
            t *= i; // Faktöriyel hesaplama
        }

        System.out.println(n + "! = " + t); // Sonuç

        giris.close();
    }
}
