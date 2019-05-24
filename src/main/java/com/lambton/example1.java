package com.lambton;

public class example1 {
    public static void main(String[] args)
    { int y=100;
      int a[] = new int[]{};
      for(int i =0; i<5 ; i++){
          a[i]= y+a[i-1];
      }
        for(int i =0; i<5 ; i++){
            System.out.println(a[i]);
        }

    }
}
