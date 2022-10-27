package Java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Buku {
    String judul;
    String penerbit;
    String tahunTerbit;
    String pengarang;
    String isbn;
    String tglKembali;
    String status;

    public enum StatusBuku {
        SUDAH_DIKEMBALIKAN("SUDAH DIKEMBALIKAN"),
        BELUM_DIKEMBALIKAN("BELUM DIKEMBALIKAN");
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void setDate(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenerbit() {
        return this.penerbit;
    }

    public String getTahunTerbit() {
        return this.tahunTerbit;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public String getISBN() {
        return this.isbn;
    }

    public String getDate() {
        return this.tglKembali;
    }

    public String getStatus() {
        return status;
    }

    public static void main(String[] args) {
        boolean confirm = true;
        List<Buku> daftarBuku = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("================= Masukan Daftar Buku =================");

        while (confirm) {
            Buku buku = new Buku();
            System.out.print("Masukan Judul : ");
            buku.setJudul(input.next());

            System.out.print("Masukan Penerbit  : ");
            buku.setPenerbit(input.next());

            System.out.print("Masukan Tahun Terbit  : ");
            buku.setTahunTerbit(input.next());

            System.out.print("Masukan Pengarang : ");
            buku.setPengarang(input.next());

            System.out.print("Masukan ISBN  : ");
            buku.setISBN(input.next());

            System.out.print("Masukan Tanggal Kembali   : ");
            buku.setDate(input.next());

            daftarBuku.add(buku);
            System.out.print("Ingin Menambahkan Data Lagi (y/n)?");
            String conf = input.next();

            confirm = conf.toLowerCase().equals("y") ? true : false;

            if (buku.getDate() == "") {
                buku.setStatus("Belum Dikembalikan");
            } else {
                buku.setStatus("Sudah Dikembalikan");
            }

            System.out.println(
                    "================================================== Daftar Nama Buku ==================================================");
            System.out.printf("%5s %10s %15s %12s %12s %20s %26s", "Judul", "Penerbit", "Tahun Terbit", "Pengarang",
                    "ISBN", "Tanggal Kembali", "Status Buku");
            System.out.println();
            // iterates over the list
            for (Buku dBuku : daftarBuku) {
                System.out.format("%5s %10s %15s %12s %12s %20s %26s", buku.getJudul(), buku.getPenerbit(),
                        buku.getTahunTerbit(), buku.getPengarang(), buku.getISBN(), buku.getDate(), buku.getStatus());
                System.out.println();
            }
        }
    }
}