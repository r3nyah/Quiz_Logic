/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author Arian
 */
public class Soal4 {
    public static void main (String[] args){
        int a = 4;
        int b = 6;
        int c = 1;
        int d = 3;
        int e = 5;
        String aa,bb,cc,dd,ee;
        //A
        if(a%2!=0){
            aa="ganjil";
        }else{
            aa="genap";
        }
        System.out.println("Nilai 4 adalah "+aa);

        //b
        if(b%2!=0){
            bb="ganjil";
        }else{
            bb="genap";
        }
        System.out.println("Nilai 6 adalah "+bb);

        //c
        if(c%2!=0){
            cc="ganjil";
        }else{
            cc="genap";
        }
        System.out.println("Nilai 1 adalah "+cc);

        //d
        if(d%2!=0){
            dd="ganjil";
        }else{
            dd="genap";
        }
        System.out.println("Nilai 3 adalah "+dd);

        //e
        if(e%2!=0){
            ee="ganjil";
        }else{
            ee="genap";
        }
        System.out.println("Nilai 5 adalah "+ee);
    }
}