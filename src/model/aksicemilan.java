package model;

public class aksicemilan {
    public static void main(String[] args){

        //Object Class 1
        cemilan Cemilan = new cemilan();
        Cemilan.nama = "Kurma";
        Cemilan.model = "Muafakat";
        Cemilan.warna = "Coklat";
        Cemilan.jenis = "Ajwa";
        Cemilan.buatan = "Zohor";
        Cemilan.asal = "Madinah";
        Cemilan.deskripsi = "Kurma Asli Mekkah";
        Cemilan.telpon = "081313375952";
        Cemilan.tampilkanAtribut();
        Cemilan.create();
        Cemilan.create("Kurma Ajwa");

        //Object Class 2
        costumercemilan costumer = new costumercemilan();
        costumer.nama = "Coklat";
        costumer.model = "Kotak";
        costumer.warna = "Putih";
        costumer.jenis = "SilverQueen";
        costumer.buatan = "Pabrik";
        costumer.asal = "Indonesia";
        costumer.deskripsi = "Coklat Asli";
        costumer.telpon = "081253478977";
        costumer.tampilkanAtribut();
        costumer.create();
        costumer.create("Coklatku");
    }
}
