package COLECCIONES;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        cargararraylist(100);

    }
    public static void cargararraylist(int n){
        int cont=0;
        ArrayList<Integer> nums= new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
                nums.add(i);
                cont++;
                if(cont==10){
                    break;
                }
            }

        }
        Iterator<Integer> itr= nums.iterator();
        while (itr.hasNext()){
            int num= itr.next();
            System.out.println(num);
        }
        for (int num:nums){
           nums.remove(num);

        }


    }
    public static void llenarnoduplicados(){
        Scanner es = new Scanner(System.in);
        int n= es.nextInt();
        ArrayList<Integer> nums= new ArrayList<>();
        Iterator<Integer> iterador= nums.iterator();

    }

}
