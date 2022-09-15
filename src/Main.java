import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inpu=new Scanner(System.in);
        int toplam=0,n;
        do {
            System.out.println("Sayı giriniz:");
            n= inpu.nextInt();
            if(n%4==0){
                toplam+=n;
            }
        }while (n%2 == 0);
        System.out.println("Toplam:"+toplam);
    }
}