package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        HashMap<Integer,String> map=new HashMap<Integer,String>();

        String[] str={"Fitbit Plus","Ipods","MI Band","Cult Pass","Macbook Pro","Digital Camera","Alexa","Sandwhich Toaster","Microwave Oven","Scale"};

        System.out.println("Goodies and Prices");
        for(int i=0;i<N;i++){
            System.out.print(str[i]+": ");
            A[i]=sc.nextInt();
            map.put(A[i],str[i]);
        }
        System.out.println();

        //Sort the Array
        int[] temp=A;
        Arrays.sort(A);
        System.out.print("Number of the employees: ");
        int n=sc.nextInt();
        System.out.println();

        //I am using window shift Method here
        //window covers from i to n-1
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=n-1;
        while(j< A.length){

            min=Math.min(min,Math.abs(A[j]-A[i]));
            i++;
            j++;
        }

        int l=0;
        int m=n-1;

        while (m<A.length){
            if(Math.abs(A[m]-A[l])==min){
                break;
            }
            l++;
            m++;
        }

        System.out.println("Here the goodies that are selected for distribution are:");
        for(int p=l;p<=m;p++){
            System.out.println(map.get(A[p])+": "+A[p]);
        }

        System.out.println();

        System.out.print("And the difference between the chosen goodie with highest price and the lowest price is ");
        System.out.println(min);
    }


}
