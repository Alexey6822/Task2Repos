/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

/**
 *
 * @author Aleksey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] array = new int[100];
       for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 10000000);
            //System.out.println(array[i]);
        }
       /* 0-10
          11-100
          101-1000
          1001-10000
          10001-100000
          100001-1000000
          1000001-*
       */
       int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0;
       for (int i = 0; i < array.length; i++){
           if (array[i] >=0 && array[i] <=10) count1++;
           if (array[i] >=11 && array[i] <=100) count2++;
           if (array[i] >=101 && array[i] <=1000) count3++;
           if (array[i] >=1001 && array[i] <=10000) count4++;
           if (array[i] >=10001 && array[i] <=100000) count5++;
           if (array[i] >=100001 && array[i] <=1000000) count6++;
           if (array[i] >=1000001) count7++;
       }
       System.out.println(String.format("0-10 = %s%n11-100 = %s%n101-1000 = %s%n1001-10000 = %s%n10001-100000 = %s%n100001-1000000 = %s%n100001+ = %s", count1, count2,count3,count4,count5,count6,count7));
    }
    
}
