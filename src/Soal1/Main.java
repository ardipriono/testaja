package Soal1;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import javax.swing.*;

/**
 * Created by ardipriono on 5/16/17.
 */
    class Soal_1 {
    public static void main(String[] args) {
        String first_name = "Ardi";
        String middle_name = "Aa";
        String last_name = "Priono";

        System.out.println(last_name);
    }
}


    class Soal_2 {
    public static void main(String[] args) {
        String a = "Ardi";
        String b = "Priono";
        a = a + "c";
        System.out.println(a);
        String c = "Test";
        a = a + "d";
        System.out.println(a + " " + b);

    }
}


    class Soal_3 {
    public static void main(String[] args) {

        int alas;
        int tinggi;
        double luas;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Alasmu : ");
        alas = scan.nextInt();
        System.out.print("Masukan Tinggimu : ");
        tinggi = scan.nextInt();

        luas = ((alas * tinggi) / 2);
        System.out.println("Luas Segitiga =  " + luas);

    }
}


    class soal_4 {
    public static void main(String[] args) {

        boolean aa = true;
        boolean bb = true;
        boolean cc = false;
        boolean dd = false;

        System.out.println(aa && bb);
        System.out.println(cc && dd);
        System.out.println(aa && cc);
        System.out.println(aa && dd);
        System.out.println(aa || bb);
        System.out.println(cc || dd);
        System.out.println(aa || cc);
        System.out.println(aa || dd);
    }
}



 class soal_5{
    public static void main(String[] args){
        int hasil = 1;
        int angka, pangkat;

        Scanner a=new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka=a.nextInt();

        System.out.print("Masukkan pangkat: ");
        Scanner b=new Scanner(System.in);
        pangkat=b.nextInt();

        for(int i=1;i<=pangkat;i++){
            hasil = hasil * angka;
        }
        System.out.println( "Hasil " +angka+ " pangkat " +pangkat+ " = " +hasil);
    }
}


 class soal_6 {
    public static void modNumbers(int i)
    {

    }
    public static void main(String[] args){

        for(int i = 0; i < 101; i++)
        {
            {
                System.out.println(i);
            }
        }

    }
}



class soal_7 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.printf("Masukan bilangan : ");
            int bilangan = s.nextInt();
            if (bilangan % 2 == 1) {
                System.out.printf( bilangan + "Adalah bilangan Ganjil");
            } else
                System.out.printf( bilangan + "Adalah bilangan Genap");

        }

    }



class LoopTesting {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(11);
        arrlist.add(10);
        arrlist.add(9);
        arrlist.add(8);
        arrlist.add(7);
        arrlist.add(6);
        arrlist.add(5);
        arrlist.add(4);
        arrlist.add(3);
        arrlist.add(2);
        arrlist.add(1);

        System.out.println("loop testing");
        for (Integer num : arrlist) {
            System.out.println(num);
        }

    }
}


class Animal {

    String name;

    String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Demo extends Thread {
        public void run(){
            Thread t1 = Thread.currentThread();
            System.out.println("Test, status" + t1.isAlive());
    }

}
    public static void main(String[] args){
        Animal hewan = new Animal();
        hewan.setName("Kucing Garong");

        System.out.println("Animal Name : " + hewan.getName());

        Demo d1 = new Demo();
        d1.start();
        try {
            d1.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("From main, status = " + d1.isAlive());
    }
}