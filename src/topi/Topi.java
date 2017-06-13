/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topi;

import java.util.Scanner;


public class Topi {
    public static void main(String[] args) {
        // TODO code application logic here
        pembeli entityObjk =new pembeli();
        Querytopi tambah = new Querytopi();
        Scanner input=new Scanner(System.in);
        String nama_pelanggan,jwb = null,alamat_pelanggan;
        long id = 0;
        
        System.out.println("SELAMAT DATANG DI toko Topi");
        System.out.println("Apakah anda ingin menambah data ? jawab ya/no");jwb=input.nextLine();
        if(jwb.equals("ya")){
        System.out.println("Masukkan Biodata Anda :");
        System.out.print("Nama Lengkap :");nama_pelanggan = input.nextLine();
        System.out.print("Alamat :");alamat_pelanggan=input.nextLine();
        entityObjk.setNama_Pelanggan(nama_pelanggan);
        entityObjk.setAlamat_Pelanggan(alamat_pelanggan);
        tambah.Add(entityObjk);
        }
        
        System.out.println("Apakah data anda ingin dilihat kan ? jawab ya/no");jwb=input.nextLine();
        if(jwb.equals("ya")){
        tambah.Show();
        }
        
        System.out.println("Apakah data anda ingin di rubah/di hapus kan ?\n"
                + "jawab lanjut : untuk rubah "
                + "\n jawab ok : untuk hapus"
                + "\n jawab tambah : untuk tambah data");
        jwb=input.nextLine();
        
        if(jwb.equals("lanjut")){
            System.out.print("Nama :");nama_pelanggan = input.nextLine();
            System.out.print("Alamat :");alamat_pelanggan = input.nextLine();
            System.out.print("ID :");id=input.nextLong();
            tambah.update(id,nama_pelanggan,alamat_pelanggan);
            tambah.Show();
            
        }else if(jwb.equals("ok")){
            tambah.Show();
            System.out.print("Masukan ID :");id=input.nextLong();
            tambah.hapus(id);
            tambah.Show();
        }else if(jwb.equals("tambah")){
            System.out.print("Nama Lengkap :");nama_pelanggan = input.nextLine();
        System.out.print("Alamat :");alamat_pelanggan=input.nextLine();
        entityObjk.setNama_Pelanggan(nama_pelanggan);
        entityObjk.setAlamat_Pelanggan(alamat_pelanggan);
        tambah.Add(entityObjk);
        
        }
    }
}
    