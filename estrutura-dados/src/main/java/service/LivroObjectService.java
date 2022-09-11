package main.java.service;

import main.java.model.Livro;

public class LivroObjectService {

    private static Livro[] livros = new Livro[1];

    private static int actualIndex = 0;

    public static void insertLivro(Livro livro) {
        if (actualIndex == livros.length) {
            livros = toAllocateNewArray();
        }

        livro.setId(actualIndex + 1);
        livros[actualIndex++] =livro;
    }

    public static Livro[] toAllocateNewArray() {
        Livro[] newLivros = new Livro[livros.length + 5];
        System.arraycopy(livros, 0, newLivros, 0, livros.length);
        return newLivros;
    }

    public static void outPrintLivros() {
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println(livro.toString());
            }
        }
    }

    public static boolean removeLivro(int id) {
        int isFind = BinarySearchService.binarySeachToId(id, livros);

        if (isFind != -1) {
            for (int i = isFind; i < livros.length - 1; i++) {
                livros[i] = livros[i + 1];
            }

            actualIndex--;
            return true;
        }

        return false;
    }

    public static void searchingToTitle(String title) {
        MergeSortService.mergeSort(0, livros.length, livros);
        int isFinded = BinarySearchService.binarySeachToTitle(title, livros);

        if (isFinded != -1) {
            System.out.println(livros[isFinded]);
        } else {
            System.out.println("Book not found");
        }
    }

}
