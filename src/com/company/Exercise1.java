package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exercise1 {

    public static class Solution {

        public static void main(String[] args) {
            int test_cases;
            Scanner in=new Scanner(System.in);
            test_cases=in.nextInt();
            double x;
            for(int i=0;i<test_cases;i++){
                x=in.nextDouble();
                double ans=(int)Math.sqrt(x);
                if(ans*ans==x){
                    System.out.println("YES");
                }
                else System.out.println("NO");

            }
        }
    }

}
