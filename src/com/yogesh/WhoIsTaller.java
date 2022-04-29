package com.yogesh;

import java.util.Scanner;

public class WhoIsTaller {
    public static void main (String[] args) {
        int t;
        int a,b;

        Scanner sc=new Scanner(System.in);

        t=sc.nextInt();
        for(int i=0;i<t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a>b){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
    }
}
