package com.day6;
// series from given two numbers
import java.io.*;

    class Fibonacciseries {

        // Function to find n terms
        // of series
        static void findSeries(int num, int first, int sec)
        {
            System.out.print(first + "num " + sec );
            int counter = 1, sum;

            // find next (num - 2) terms
            // of series as first two
            // terms are already given
            while (counter < num - 1)
            {
                sum = first + sec;
                System.out.print( sum + " ");
                first = sec;
                sec = sum;
                counter++;
            }
        }

        // Drivers code
        public static void main (String[] args)
        {
            int n = 0, first = 1, sec = 2;

            findSeries(n, first, sec);
        }
    }
