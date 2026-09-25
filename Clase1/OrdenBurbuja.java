package Clase1;

import java.util.Arrays;

public class OrdenBurbuja {
    public static void main(String[] args){
        int[] num = {3, 5, 9, 2, 2, 6, 0, 7};
        for(int i = num.length; i> 0; i--){
            for(int j = 0 ; j < i - 1; j++){
                if(num[j] > num[j+1]){
                    int aux =num[j];
                    num[j] = num[j+1];
                    num[j+1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}