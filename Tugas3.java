import java.util.Scanner;

public class Tugas3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        int menuBD = 0;
        while (menuBD != 3) {
            System.out.println("BANGUN DATAR");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Jajar Genjang");

            System.out.print("Pilih Salah Satu : ");
            menuBD = input.nextInt();
            if (menuBD == 1) {
                persegi();
            } else if (menuBD == 2) {
                persegiPanjang();
            } else if (menuBD == 3) {
                segitiga();
            } else if (menuBD == 4) {
                jajarGenjang();

            }
        }
    }

    public static void persegi() {

        int menuPersegi = 0;
        while (menuPersegi != 3) {
            System.out.println("PERSEGI");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali ke menu utama");
            System.out.print("Pilih satu : ");
            menuPersegi = input.nextInt();

            if (menuPersegi == 1) {
                System.out.print("Panjang sisi = ");
                int x = input.nextInt();
                System.out.println("Luas persegi = " + luasPersegi(x));
            } else if (menuPersegi == 2) {
                System.out.print("Panjang sisi = ");
                int x = input.nextInt();
                System.out.println("Keliling persegi = " + kelilingPersegi(x));
            } else if (menuPersegi == 3) {
                mainMenu();
            }
        }

    }

    public static void persegiPanjang() {
        int menuPersegiPanjang = 0;
        while (menuPersegiPanjang != 3) {
            System.out.println("PERSEGI PANJANG");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali ke menu utama");
            System.out.print("Pilih Satu : ");
            menuPersegiPanjang = input.nextInt();

            if (menuPersegiPanjang == 1) {
                System.out.print("Panjang sisi = ");
                int x = input.nextInt();
                System.out.print("Lebar sisi = ");
                int y = input.nextInt();
                System.out.println("Luas persegi panjang = " + luasPersegiPanjang(x, y));
            } else if (menuPersegiPanjang == 2) {
                System.out.print("Panjang sisi =  ");
                int x = input.nextInt();
                System.out.print("Lebar sisi = ");
                int y = input.nextInt();
                System.out.println("Keliling persegi panjang = " + kelilingPersegiPanjang(x, y));
            } else if (menuPersegiPanjang == 3) {
                mainMenu();
            }
        }

    }

    public static void segitiga() {

        int menuSegitiga = 0;

        while (menuSegitiga != 3) {
            System.out.println("SEGITIGA");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali ke menu utama");
            System.out.print("Pilih satu : ");
            menuSegitiga = input.nextInt();

            if (menuSegitiga == 1) {
                System.out.print("Sisi alas = ");
                double x = input.nextDouble();
                System.out.print("Tinggi = ");
                double y = input.nextDouble();
                System.out.println("Luas segitiga = " + luasSegitiga(x, y));
            } else if (menuSegitiga == 2) {
                System.out.print("Sisi alas = ");
                double x = input.nextDouble();
                System.out.print("Tinggi = ");
                double y = input.nextDouble();
                System.out.print("Sisi miring = ");
                double z = input.nextDouble();
                System.out.println("Keliling segitiga = " + kelilingSegitiga(x, y, z));
            } else if (menuSegitiga == 3) {
                mainMenu();
            }
        }

    }

    public static void jajarGenjang() {

        int menuJajarGenjang = 0;

        while (menuJajarGenjang != 3) {
            System.out.println("JAJAR GENJANG");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali ke menu utama");
            System.out.print("Pilih Satu : ");
            menuJajarGenjang = input.nextInt();

            if (menuJajarGenjang == 1) {
                System.out.print("Sisi alas = ");
                double s1 = input.nextDouble();
                System.out.print("Tinggi = ");
                double s2 = input.nextDouble();
                System.out.println("Luas jajar genjang = " + luasJajarGenjang(s1, s2));
            } else if (menuJajarGenjang == 2) {
                System.out.print("Masukan alas = ");
                double s1 = input.nextDouble();
                System.out.print("Sisi miring : ");
                double s2 = input.nextDouble();
                System.out.println("Keliling jajar genjang = " + kelilingJajarGenjang(s1, s2));
            } else if (menuJajarGenjang == 3) {
                mainMenu();
            }
        }

    }

    public static int luasPersegi(int x) {
        return x * x;
    }

    public static int kelilingPersegi(int x) {
        return 4 * x;
    }

    public static int luasPersegiPanjang(int x, int y) {
        return (x * y);
    }

    public static int kelilingPersegiPanjang(int x, int y) {
        return (2 * (x + y));
    }

    public static double luasSegitiga(double x, double y) {
        return (x * y * 2);
    }

    public static double kelilingSegitiga(double x, double y, double z) {
        return (x + y + z);
    }

    public static double luasJajarGenjang(double x, double y) {
        return (x * y);
    }

    public static double kelilingJajarGenjang(double x, double y) {
        return (2 * (x + y));
    }

}