// Bu programı kullanarak 1'den N'ye kadar olan çift sayıları tespit edebilirsiniz

package projeler;

import java.util.Scanner;

public class işlem5
{
    public static void main(String [] args)
    {

        Scanner giris = new Scanner(System.in);
        System.out.println("Bir N değeri girin: ");
        int n = giris.nextInt();

        System.out.println("1'den " +n+ " 'e  kadar olan çift sayılar:");


        for (int i = 1; i <= n; i++)
        { // i değeri 1 olarak başlat ve n değerine eşit veya küçük olana devam eder ++
            if (i % 2 == 0) // 2'ye bölündüğünde 0'a eşit olan sayıların çıktısını alıyoruz
            {

                System.out.print(i + " ");
            }


        }

    }
}

