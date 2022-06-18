package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.function.IntFunction;

public class CompararJuguetePrecioFinal implements Comparator<Juguete> {

    @Override
    public int compare(Juguete j1, Juguete j2) {
        if (j2.getPrecioFinal() > j1.getPrecioFinal()) {
            return -1;
        } else {
            return 1;
        }

    }


}

