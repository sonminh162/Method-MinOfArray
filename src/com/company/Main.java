package com.company;

import java.util.Scanner;

public class Main {
    public static int minOfArray(int[] array){
        int min,i;
        min = array[0];
        for(i = 0; i<array.length;i++){
            if(array[i]<min)min=array[i];
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int i,size;
        System.out.println("Khai bao kich co mang:");
        size=scanner.nextInt();
        array = new int[size];
        System.out.println("Khai bao cac gia tri cua mang:");
        for(i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Gia tri nho nhat trong mang la:"+minOfArray(array));
    }
}
