package model;

import java.sql.SQLOutput;

public class cemilan {

    public String nama;
    public String model;
    public String warna;
    public String jenis;
    public String buatan;
    public String asal;
    public String deskripsi;
    public String telpon;


    public void tampilkanAtribut(){
        System.out.println("======================================");
        System.out.println("Nama Cemilan :"+nama);
        System.out.println("Model Cemilan :"+model);
        System.out.println("Warna Cemilan :"+warna);
        System.out.println("Jenis Cemilan :"+jenis);
        System.out.println("Buatan :"+buatan);
        System.out.println("Asal Cemilan :"+asal);
        System.out.println("Deskripsi Cemilan :"+deskripsi);
        System.out.println("Telpon :"+telpon);
    }
    public void tampilkanInfocemilan(){
        System.out.println("=====================================");
        System.out.println("Nama Cemilan :"+nama);
        System.out.println("Warna Cemilan :"+warna);
        System.out.println("Buatan :"+buatan);
        System.out.println("Asal Cemilan :"+asal);
    }
    public boolean create(){
        String insertCreate = "INSERT INTO CEMILAN VALUES ('"+nama+"','"+warna"','"+buatan+"')";
        System.out.println(insertCreate);
        boolean berhasil = true;
        if(berhasil){
            return  true;
        }else{
            return false;
        }
    }
    public boolean create(String jenis){
        String insertCreate = "INSERT INTO CEMILAN VALUES JENIS CEMILAN "+ jenis;
        System.out.println(insertCreate);
        return false;

    }

}
