package com.mycompany.romano;

import java.util.HashMap;
import java.util.Map;

public class RomanoAEntero {

    public static void main(String[] args) {

        int a = romanAEntero("MMXXIII");
        System.out.println(a);
    }

    public static int romanAEntero(String s) {
        
        //s = "LVIII"
        int resultado = 0;
        int length = s.length();//5

        Map<Character, Integer> romanoM = getRomanoMapa();
        //i=4
        //length = 4
        //resultado50+5+1+1
        for (int i = 0; i < length - 1; i++) {

            int valorActual = romanoM.get(s.charAt(i));

            if (valorActual < romanoM.get(s.charAt(i + 1))) {
                resultado -= valorActual;
            } else {
                resultado += valorActual;
            }
        }

        return resultado + romanoM.get(s.charAt(length-1));
    }

    public static Map<Character, Integer> getRomanoMapa() {
        Map<Character, Integer> romano = new HashMap<>();
        romano.put('I', 1);
        romano.put('V', 5);
        romano.put('X', 10);
        romano.put('L', 50);
        romano.put('C', 100);
        romano.put('D', 500);
        romano.put('M', 1000);
        return romano;
    }
}
