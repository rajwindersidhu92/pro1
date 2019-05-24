package com.lambton;

public class Example1 {
    public static void main(String[] args)
    { int sum=0;
      int a[] = new int[5];
        a[0] =100;
        a[1] =200;
        a[2] =300;
        a[3] =400;
        a[4] =500;
      for (int i = 0;i<a.length; i++){
          System.out.println("a[]:"+a[i]);
          sum = sum + a[i];
      }
      System.out.println("sum = "+sum);

    }
}
