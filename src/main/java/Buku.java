//Prinsip-Prinsip Perancangan Kelas /* Mendeklarasikan Kelas */
import java.io.*;
class Buku {
    //atributes
    private String pengarang;
    private String judul;
    private int jmlh_Halaman;
    private float diskon;
    private double harga;
    //methods
    public Buku()
    { //constructor
        System.out.println("Konstruktor buku dijalankan...");
    }
    //fungsi-fungsi mutator
    public void setPengarang(String Pengarang)
    {
        pengarang=Pengarang;
    }
    public void setJudul(String Judul)
    {
        judul=Judul;
    }
    public void setJmlhHalaman(int JmlhHalaman)
    {
        jmlh_Halaman = JmlhHalaman;
    }
    //fungsi-fungsi accessor
    public String getPengarang()
    {
        return pengarang;
    }
    public String getJudul()
    {
        return judul;
    }
    public int getJmlhHalaman()
    {
        return jmlh_Halaman;
    }
    //method overloading
    public void setInfo(float dskn, double HargaBuku)
    {
        diskon=dskn;
        harga=HargaBuku-(HargaBuku*diskon);
    }
    public void setInfo(double HargaBuku)
    {
        diskon=0.1F;
        harga=HargaBuku-(HargaBuku*diskon);
    }
    public void cetak()
    {
        System.out.println("Judul Buku : "+getJudul());
        System.out.println("Pengarang Buku : "+getPengarang());
        System.out.println("Jumlah halaman Buku : "
                +getJmlhHalaman()+" halaman");
        System.out.println("Diskon Buku : "+diskon);
        System.out.println("Harga Buku : "+harga);
        System.out.println("");
    }
}