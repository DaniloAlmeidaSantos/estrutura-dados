package main.java.service;

import main.java.model.Livro;

public class MergeSortService {
    public static void mergeSort(int start, int size, Livro[] v) {
        if (start < size - 1) {
            int mid = (start + size) / 2;
            mergeSort(start, mid, v);
            mergeSort(mid, size, v);
            intercalar(start, mid, size, v);
        }
    }

    private static void intercalar(int start, int mid, int size, Livro[] v) {
        int i, j, k;
        Livro[] aux = new Livro[size - start];
        i = start;
        j = mid;
        k = 0;
        while (i < mid && j < size) {
            if (v[i] != null && v[j] != null && v[i].getTitulo().compareTo(v[j].getTitulo()) < 0) {
                aux[k] = v[i];
                k++;
                i++;
            } else {
                aux[k] = v[j];
                k++;
                j++;
            }
        }
        while (i < mid) {
            aux[k] = v[i];
            k++;
            i++;
        }

        while (j < size) {
            aux[k] = v[j];
            k++;
            j++;
        }
        for (i = start; i < size; i++) {
            v[i] = aux[i - start];
        }
    }

}
