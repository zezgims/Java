
import java.util.Scanner;

public class FindArmstrongNumbers {
  
    public static void main(String[] args)
    {
        int sayi, temp, deger, toplam=0, basamak=0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lutfen bir sayi giriniz.");
        sayi=scanner.nextInt();
        
        temp=sayi;
        
            deger=temp%10;
            temp/=10;
            basamak++;
        System.out.println("Girilen sayi "+basamak+" basamaklidir.");
        
        do {            
            toplam+=Math.pow(deger, basamak);
        } while (temp>0);
        
        if(sayi==
