public class Bebas {
    private String no_ktp;
    private String nama_lengkap;
    private String jenis_kelamin;
    private String alamat;

public void noKTP(){
    System.out.println("Ini method Nomor KTP");
}

public String getNoKTP(){

    return this.no_ktp;
}

public void setNoKTP(String no_ktp){

    this.no_ktp =no_ktp;
}


public void namaLengkap(){
    System.out.println("Ini method Nama Lengkap");
}

public String getNamaLengkap(){
    return this.nama_lengkap;
}

public void setNamaLengkap(String nama_lengkap){

    this.nama_lengkap = nama_lengkap;
}


public void jenisKelamin(){

    System.out.println("Ini method Jenis Kelamin");
}

public String getJenisKelamin(){

    return this.jenis_kelamin;
}

public void setJenisKelamin(String jenis_kelamin){

    this.jenis_kelamin = jenis_kelamin;
}


public void alamat(){

    System.out.println("Ini method Alamat");
}

public String getAlamat(){
    return this.alamat;
}

public void setAlamat(String alamat){
    this.alamat = alamat;
}

}
