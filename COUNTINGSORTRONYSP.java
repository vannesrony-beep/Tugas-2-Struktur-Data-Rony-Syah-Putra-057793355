public class COUNTINGSORTRONYSP {

// METHOD UNTUK MENGURUTKAN DATA

static void sort(int[] data) {
    if (data.length == 0) {
        return;
    }

// MENCARI NILAI TERKECIL DAN TERBESAR

int minimum = data[0];
int maksimum = data[0];

for (int i = 0; i < data.length; i++) {
    if (data[i] < minimum) {
        minimum = data[i];
    }

    if (data[i] > maksimum) {
        maksimum = data[i];
    }
}

// MEMBUAT ARRAY UNTUK MENGHITUNG FREKUENSI

int rentang = maksimum - minimum + 1;
int[] jumlah = new int[rentang];

// MENGHITUNG KEMUNCULAN SETIAP ANGKA

for (int i = 0; i < data.length; i++) {
    jumlah[data[i] - minimum]++;
}

// MENYUSUN DATA DARI TERBESAR KE TERKECIL

int indeks = 0;

for (int i = jumlah.length-1; i >= 0; i--){
    while (jumlah[i] > 0) {
        data[indeks] = i + minimum;
        indeks++;
        jumlah[i]--;
    }
}
}

// METHOD UNTUK MENAMPILKAN DATA

static void tampilkanData(int[] data) {
    for (int i = 0; i < data.length; i++) {
        System.out.print(data[i] + " ");
    }
    System.out.println();
}

public static void main(String[] args) {

    int[] data = {1, 17, 14, 23, 1, 8, 25, 21};
    System.out.println("=======================");
    System.out.println(">> PROGRAM COUNTING SORT <<");
    System.out.println("=======================");

    System.out.println("Data sebelum diurutkan : ");
    tampilkanData(data);

    System.out.println("Jumlah data :" + data.length);

    sort(data);

    System.out.println("\nData setelah diurutkan : ");
    tampilkanData(data);

    System.out.println("Jumlah data :" + data.length);
}
}