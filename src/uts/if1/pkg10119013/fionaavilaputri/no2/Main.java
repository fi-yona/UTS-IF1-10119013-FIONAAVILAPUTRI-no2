/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package uts.if1.pkg10119013.fionaavilaputri.no2;

/**
 *
 * @author Fiona Avila
 */


public class Main {

    public static void main(String[] args) {
        System.out.println("====Program Penarikan Saldo====");
        int saldo = 0;
        int jumlah = 0;
        Tabungan t = new Tabungan(saldo);
        t.ambilUang(jumlah);
    }
    
}
