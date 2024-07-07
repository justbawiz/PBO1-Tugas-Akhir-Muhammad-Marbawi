public class Buku {
    private String judul;
    private String penulis;
    private Double jumlah_halaman;
    private Double kenaikan;
    private Double harga;

public void judulBuku(){

    System.out.println("Ini method Judul Buku");
}

public void namaPenulis(){

    System.out.println("Ini method Nama Penulis");
}

public void jumlahHalamanBuku(){

    System.out.println("Ini method Jumlah Halaman Buku");
}

public void Harga(){
    System.out.println("Ini method Harga Buku");
}

public void kenaikanBuku(){

    System.out.println("Ini method Kenaikan Buku");
}

public String getJudul(){
    return this.judul;
}

public String getPenulis(){
    return this.penulis;
}

public Double getJumlahHalaman(){
    return this.jumlah_halaman;
}

public Double getKenaikan(){
    return this.kenaikan;
}

public Double getHarga(){
    return this.harga;
}

public Double getNaikkanHarga(){
    return this.kenaikan;
}


public void setJudul(String judul){
    this.judul = judul;
}

public void setPenulis(String penulis){
    this.penulis = penulis;
}

public void setJumlahHalaman(Double jumlah_halaman){
    this.jumlah_halaman = jumlah_halaman;
}

public void setHarga(Double harga){
    this.harga = harga;
}

public void setNaikkanharga(Double kenaikan){
    this.kenaikan = kenaikan;
}

public void NaikkanHarga(){
    System.out.println("Buku ini harganya naik!");
}
}