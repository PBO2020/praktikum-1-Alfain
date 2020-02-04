
import java.util.Scanner;
import java.util.ArrayList;

public class TP {

    Scanner tm = new Scanner(System.in);
    ArrayList<String> data1 = new ArrayList();
    ArrayList<String> data2 = new ArrayList();
    ArrayList<String> data3 = new ArrayList();
    ArrayList<String> data4 = new ArrayList();
    ArrayList data5 = new ArrayList();
    String nik;
    String nama;
    String ttl;
    String jk;
    int gol;
    int pilih;

    public static void main(String[] args) {
        TP haha = new TP();
        haha.Input();
    }

    public void Pilih() {
        System.out.println("");
        System.out.println(" ----------------------------");
        System.out.println("|         Menu Pilih         |");
        System.out.println(" ---------------------------- ");
        System.out.println("| 1. Info Data               |");
        System.out.println("| 2. Tambah Baru             |");
        System.out.println("| 3. Exit                    |");
        System.out.print("  Nomor : ");
        pilih = tm.nextInt();
        System.out.println(" ---------------------------- ");
        System.out.println("");

        switch (pilih) {
            case 1:
                Output();
                break;
            case 2:
                TambahInput();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Pilih Nomor.");
                Pilih();
                break;
        }
    }

    public void Input() {
        System.out.print(" NIK            : ");
        nik = tm.next();
        data1.add(nik);
        System.out.print(" Nama           : ");
        nama = tm.next();
        data2.add(nama);
        System.out.print(" TTL            : ");
        ttl = tm.next();
        data3.add(ttl);
        System.out.print(" Jenis Kelamin  : ");
        jk = tm.next();
        data4.add(jk);
        System.out.print(" Golongan Darah : ");
        gol = tm.nextInt();
        if (gol == 1) {
            data5.add("A");
        } else if (gol == 2) {
            data5.add("B");
        } else if (gol == 3) {
            data5.add("AB");
        } else if (gol == 4) {
            data5.add("O");
        }
        Pilih();
    }

    public void TambahInput() {
        System.out.print(" NIK            : ");
        nik = tm.next();
        data1.add(nik);
        System.out.print(" Nama           : ");
        nama = tm.next();
        data2.add(nama);
        System.out.print(" TTL            : ");
        ttl = tm.next();
        data3.add(ttl);
        System.out.print(" Jenis Kelamin  : ");
        jk = tm.next();
        data4.add(jk);
        System.out.print(" Golongan Darah : ");
        gol = tm.nextInt();
        if (gol == 1) {
            data5.add("A");
        } else if (gol == 2) {
            data5.add("B");
        } else if (gol == 3) {
            data5.add("AB");
        } else if (gol == 4) {
            data5.add("O");
        }
        Pilih();
    }

    public void Output() {
        for (int i = 0; i < data1.size(); i++) {
            System.out.println("NIK            : " + data1.get(i));
            System.out.println("Nama           : " + data2.get(i));
            System.out.println("TTL            : " + data3.get(i));
            System.out.println("Jenis Kelamin  : " + data4.get(i));
            System.out.println("Golongan Darah : " + data5.get(i));
            System.out.println("-------------------------");
        }
        Pilih();
    }

}
