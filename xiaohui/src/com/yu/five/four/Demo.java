package com.yu.five.four;

import java.util.ArrayList;
import java.util.Random;

/**
 * 使用ArrayList实现
 * @Description: 

 * @File: Demo.java

 * @Package None

 * @Author Hanyonglu

 * @Date 2012-10-18 下午06:16:55

 * @Version V1.0
 */
public class Demo {
    public static void main(String[] args) {
        Object[] values = new Object[5];
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < values.length;i++){
            int number = random.nextInt(38) + 1;
            
            if(!list.contains(number)){
                list.add(number);
            }
        }
        
        values = list.toArray();
        
        // 遍历数组并打印数据
        for(int i = 0;i < values.length;i++){
            System.out.print(values[i] + "\t");
            
            if(( i + 1 ) % 10 == 0){
                System.out.println("\n");
            }
        }
    }
}