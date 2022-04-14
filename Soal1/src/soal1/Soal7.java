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
public class Soal7 {
    public static void main (String[] args){
        int[] arr=new int [] {4, 1, 7, 7, 1};   
    System.out.println("Duplicate number in array");
    for(int i = 0; i < arr.length; i++) {  
        for(int j = i + 1; j < arr.length; j++) {  
            if(arr[i] == arr[j])  
                System.out.println(arr[j]);  
                
        }  
    }  
}  
}  
