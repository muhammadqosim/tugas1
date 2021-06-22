package model;

//SubClass/Child-Class
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

    //Getter And Setter


    public String getNamacostumercemilan() {
        return namacostumercemilan;
    }

    public void setNamacostumercemilan(String namacostumercemilan) {
        this.namacostumercemilan = namacostumercemilan;
    }

    public String getNamarisellercemilan() {
        return namarisellercemilan;
    }

    public void setNamarisellercemilan(String namarisellercemilan) {
        this.namarisellercemilan = namarisellercemilan;
    }

    public String getJumlahcemilanyangdibeli() {
        return jumlahcemilanyangdibeli;
    }

    public void setJumlahcemilanyangdibeli(String jumlahcemilanyangdibeli) {
        this.jumlahcemilanyangdibeli = jumlahcemilanyangdibeli;
    }

    //Overriding


    @Override
    public boolean create() {
        return super.create();}

    @Override
    public boolean create(String jenis) {
        return super.create(jenis);
    }
}
