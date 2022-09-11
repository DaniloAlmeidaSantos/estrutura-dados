package main.java.service;

import main.java.model.Livro;

public class BinarySearchService {

    public static int binarySeachToId(int id, Livro[] livros) {
        int start = 0, end = livros.length - 1, center;

        while (start <= end) {
            center = (start + end) / 2;
            if (id == livros[center].getId()) {
                return center;
            } else if (id > livros[center].getId()) {
                start = center + 1;
            } else {
                end = center - 1;
            }
        }

        return -1;
    }

    public static int binarySeachToTitle(String title, Livro[] livros) {
        int start = 0, end = livros.length - 1, center;

        while (start <= end) {
            center = (start + end) / 2;
            if (title.compareTo(livros[center].getTitulo()) == 0) {
                return center;
            } else if (title.compareTo(livros[center].getTitulo()) > 0) {
                start = center + 1;
            } else {
                end = center - 1;
            }
        }

        return -1;
    }

}
