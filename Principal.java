//package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Principal {
    public static void main(String[] args) {
        
        Alquiler[] historia = new Alquiler[6];
        MotoAcuatica moto1 = new MotoAcuatica("015", "VXCruiser", "Yamaha");
        MotoAcuatica moto2 = new MotoAcuatica("014", "VXCruiser", "Yamaha");
        MotoAcuatica moto3 = new MotoAcuatica("005", "VXCruiser", "Yamaha");
        MotoAcuatica moto4 = new MotoAcuatica("021", "VXCruiser", "Yamaha");
        MotoAcuatica moto5 = new MotoAcuatica("018", "VXCruiser", "Yamaha");
        MotoAcuatica moto6 = new MotoAcuatica("014", "VXCruiser", "Yamaha");

        Persona persona1 = new Persona("2155", 17, "Carlito");
        Persona persona2 = new Persona("73251", 19, "Juan");
        Persona persona3 = new Persona("63743", 25, "Valeria");
        Persona persona4 = new Persona("6785", 33, "Jose");
        Persona persona5 = new Persona("6785", 21, "Miguel");
        Persona persona6 = new Persona("514231", 48, "Maria");

        historia[0] = new Alquiler(1, persona1, moto1);
        historia[1] = new Alquiler(2, persona2, moto2);
        historia[2] = new Alquiler(3, persona3, moto3);
        historia[3] = new Alquiler(4, persona4, moto4);
        historia[4] = new Alquiler(5, persona5, moto5);
        historia[5] = new Alquiler(6, persona6, moto6);
       

        HashMap<String, Integer> salidaHashMap = new HashMap<String, Integer>();

        salidaHashMap = Alquiler.AnalizarAlquileres(historia);

        System.out.println("Salida Metodo" +salidaHashMap);
    }
}
