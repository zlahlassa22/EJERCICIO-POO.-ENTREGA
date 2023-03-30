package arrayclases;

import java.util.Scanner;

public class matrix1 {
    private int [][] numero;
    private int nr;
    private int nc;
    matrix1(int [][] nums){
        nums=new int [nr][nc];


    }
    matrix1( int nr, int nc){
        this.nr=nr;
        this.nc=nc;

    }

    public int[][] getNumero() {
        return numero;
    }

    public int getNr() {
        return nr;
    }

    public int getNc() {
        return nc;
    }
    public void loadByRows(){
        Scanner sc= new Scanner(System.in);

        /*for (int i = 0; i < nr; i++) {
            int n= sc.nextInt();
            this.numero[i]=n;

        }*/
    }
}
