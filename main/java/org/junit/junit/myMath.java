package org.junit.junit;

public class myMath {

    public int calculateSum(int [] numbers){
        int sum = 0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }
}
