package com.harrypotter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Basket {
    ArrayList<Integer> booksArrayList = new ArrayList<>();
    NumberFormat numberFormat = new DecimalFormat("0.00");

    public void add(int book) {
        booksArrayList.add(book);
    }

    public double calculate() {
        if (booksArrayList.isEmpty()) {
            return 0.00D;
        }
        double price = 8.00D;
        double total = 0.00D;
        int countDifferentBook;
        double[] discount = new double[]{1.00D, 0.95D, 0.90D, 0.80D, 0.75D};
        int[] countBooksByEdition = getCountBooksByEdition();

        for (int indexBooksEdition = 0; indexBooksEdition < countBooksByEdition.length; indexBooksEdition++) {
            if (isEmptyBooks(countBooksByEdition[indexBooksEdition])) {
                countDifferentBook = getCountDifferentBook(countBooksByEdition);
                total += price * countDifferentBook * discount[countDifferentBook - 1];
                if (isEmptyBooks(countBooksByEdition[indexBooksEdition]))
                    indexBooksEdition--;
            }
        }
        return Double.parseDouble(numberFormat.format(total));
    }

    private int getCountDifferentBook(int[] countBooksByEdition) {
        int countDifferentBook = 0;
        for (int indexBooksEdition = 0; indexBooksEdition < countBooksByEdition.length; indexBooksEdition++) {
            if (isEmptyBooks(countBooksByEdition[indexBooksEdition])) {
                countDifferentBook++;
                countBooksByEdition[indexBooksEdition]--;
            }
        }
        return countDifferentBook;
    }

    private int[] getCountBooksByEdition() {
        int countBooksByEdition[] = new int[5];
        for (int indexBooks : booksArrayList) {
            if (indexBooks == Books.HARRY_POTTER_BOOK_1)
                countBooksByEdition[0]++;
            else if (indexBooks == Books.HARRY_POTTER_BOOK_2)
                countBooksByEdition[1]++;
            else if (indexBooks == Books.HARRY_POTTER_BOOK_3)
                countBooksByEdition[2]++;
            else if (indexBooks == Books.HARRY_POTTER_BOOK_4)
                countBooksByEdition[3]++;
            else if (indexBooks == Books.HARRY_POTTER_BOOK_5)
                countBooksByEdition[4]++;
        }
        return countBooksByEdition;
    }

    private boolean isEmptyBooks(int countBooks) {
        return countBooks != 0;
    }
}
