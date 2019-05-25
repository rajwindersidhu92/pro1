package com.lambton;

public class Sample {


        public static void main(String[] args)
        {
            String s1 = "hello";
            String s2 = s1;
            s1 ="hello world";
            System.out.println(s2);

            System.out.println(s1.charAt(2));
            System.out.println(s1.contains("lo"));
            //            int sum=0;
//
//            int a[] = new int[5];
//            a[0] =100;
//            a[1] =200;
//            a[2] =300;
//            a[3] =400;
//            a[4] =500;
//            for (int i = 0;i<a.length; i++){
//                System.out.println("a[]:"+a[i]);
//                sum = sum + a[i];
//            }
//            System.out.println("sum = "+sum);
//            sum =0;
//
//            for ( int x : a){
//                sum = sum +x ;
//            }

//            System.out.println("sum is " + main.s);
//            System.out.println("reverse arr ="+ main.revarray(a));


        }

//        public int[] revarray( int[] x) {
//            int arr[] = new int[x.length];
//            arr = x;
//            return(arr);
//        }


}
