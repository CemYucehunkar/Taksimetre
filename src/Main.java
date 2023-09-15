import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km,ücret;
        int acılısUcreti=10;
        double kmUcreti=2.2 , total;

        Scanner yol=new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz:");
        km=yol.nextInt();

        total=acılısUcreti+(kmUcreti*km);
        total=(total<20) ? 20 : total;
        System.out.print(total);



        }
    }