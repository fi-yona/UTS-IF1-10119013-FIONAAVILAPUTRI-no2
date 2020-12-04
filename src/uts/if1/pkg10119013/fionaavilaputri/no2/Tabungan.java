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

import java.util.Scanner;


public class Tabungan {
    
    private final int saldo;
    
    public Tabungan(int saldo){
        Scanner scanSaldoAwal = new Scanner (System.in);
        System.out.print("Masukkan saldo awal : Rp ");
        this.saldo = scanSaldoAwal.nextInt();
    }
    
    public int ambilUang(int jumlah){
        Scanner scanAmbil = new Scanner (System.in);
        System.out.print("Jumlah uang yang diambil : Rp ");
        jumlah = scanAmbil.nextInt();
        int saldoAkhir = saldo - jumlah;
        System.out.println("Saldo anda sekarang : Rp " + saldoAkhir);
        return saldoAkhir;
    }
}
