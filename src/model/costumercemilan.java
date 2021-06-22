package model;

//SubClass/Child-Classs
public class costumercemilan extends cemilan {
    
    public String namacostumercemilan;
    public String namarisellercemilan;
    public String jumlahcemilanyangdibeli;
    
    public void inforisellercemilan(){
        System.out.println("=======================================================");
        System.out.println("Nama Costumer Cemilan : "+namacostumercemilan);
        System.out.println("Nama Riseller Cemilan : "+namarisellercemilan);
        System.out.println("Jumlah Cemilan Yang Dibeli : "+jumlahcemilanyangdibeli);
    }
    public void jumlahinfo(){
        String jc = "INSERT INTO CEMILAN VALUES ('"+jumlahcemilanyangdibeli+"')";
        System.out.println(jc);
    }
}
