/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Soal8 {
    public static void Main (String[] args){
        Scanner input = new Scanner(System.in);
        //Title
        //xxxxxx

        int[] arr = new int[100];
        int arr_count,i,max_num;

        System.out.println("Masukan angka");
        arr_count=input.nextInt();
        System.out.println("Input angka "+arr_count+" Dipisah dengan enter");

        //save angka ke array
        for(i=0;i<arr_count;i++){
            arr[i] = input.nextInt();
        }
        //space
        max_num = arr[0];
        //proses
        for(i=0;i<arr_count;i++){
            if(arr[i] > max_num){
                max_num = arr[i];
            }
        }
        System.out.println("Max :"+max_num);
    }
}