package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        double sum = 0;
        boolean sweach = false;
    double[] aisuluu = {0.9 ,1.2 , -3.2 ,6.6 , -0.4 , 1.1 ,
            6.6 ,0.7 ,-4.9 ,4.3 ,0.1 ,1.3 ,9.1 ,-8.9 ,6.2 ,5.5};
        for ( double i : aisuluu) {
            if (i < 0 ){
                sweach = true;
            }
            else if (sweach){
                sum += i;
                num++;
                System.out.println(sum / num);
            }
        }
    }
}
