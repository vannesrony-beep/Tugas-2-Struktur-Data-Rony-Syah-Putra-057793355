
public class MERGESORTRONYSP {

    // METHOD UNTUK MEMBAGI DATA
    static void sort(int[] data, int kiri, int kanan) {
        if (kiri < kanan) {
            int tengah = (kiri + kanan) / 2;

            sort(data, kiri, tengah);
            sort(data, tengah + 1, kanan);

            merge(data, kiri, tengah, kanan);
        }
    }

    // METHOD UNTUK MENGGABUNGKAN DATA
    static void merge(int[] data, int kiri, int tengah, int kanan) {
        int[] kiriData = new int[tengah - kiri + 1];
        int[] kananData = new int[kanan - tengah];

        for (int i = 0; i < kiriData.length; i++) {
            kiriData[i] = data[kiri + i];
        }

        for (int i = 0; i < kananData.length; i++) {
            kananData[i] = data[tengah + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = kiri;

        // MENGURUTKAN DARI TERBESAR KE TERKECIL
        while (i < kiriData.length && j < kananData.length) {
            if (kiriData[i] >= kananData[j]) {
                data[k] = kiriData[i];
                i++;
            } else {
                data[k] = kananData[j];
                j++;
            }
            k++;
        }

        // MASUKKAN SISA DATA KIRI
        while (i < kiriData.length) {
            data[k] = kiriData[i];
            i++;
            k++;
        }

        // MASUKKAN SISA DATA KANAN
        while (j < kananData.length) {
            data[k] = kananData[j];
            j++;
            k++;
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

        System.out.println("========================");
        System.out.println(">> PROGRAM MERGE SORT <<");
        System.out.println("========================");

        System.out.println("Data sebelum diurutkan :");
        tampilkanData(data);

        System.out.println("Jumlah data : " + data.length);

        sort(data, 0, data.length - 1);

        System.out.println("\nData setelah diurutkan :");
        tampilkanData(data);

        System.out.println("Jumlah data : " + data.length);
    }
}
