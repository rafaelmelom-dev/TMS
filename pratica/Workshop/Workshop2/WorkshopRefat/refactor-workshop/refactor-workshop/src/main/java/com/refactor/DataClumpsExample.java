
package com.refactor;

/**
 * EXERCÍCIO: Code Smell - Data Clumps
 * Objetivo:
 *  - Criar classe Address e substituir grupos de campos repetidos
 * Critério de aceite:
 *  - Reduzir repetição dos trios street/city/zip
 */
public class DataClumpsExample {

    public static class Address {
        public String street;
        public String city;
        public String zip;
    }

    // TODO: substituir os 3 campos por Address em ambas as classes.
    // FEITO
    public static class Customer {
        public Address address;
        public String name;
    }

    public static class Supplier {
        public Address address;
        public String companyName;
    }
}
