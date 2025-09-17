package com.refactor.LargeClassExample;

import java.util.List;

public class DataLoader {
    // carrega dados
    public static List<Record> load(List<Record> data) {
        data.add(new Record("A", 10));
        data.add(new Record("B", 30));
        data.add(new Record("A", 25));
        data.add(new Record("C", 7));

        return data;
    }
}
