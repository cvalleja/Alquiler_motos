//package model;

import java.util.HashMap;

public class Alquiler {
    private int Id;
    private Persona Cliente;
    private MotoAcuatica Moto;

    public Alquiler(int id, Persona cliente, MotoAcuatica moto) {
        this.Id         = id;
        this.Cliente    = cliente;
        this.Moto       = moto;
    }

    public Persona getCliente() {
        return Cliente;
    }

    public double TerminarAlquiler(int cantidadHoras, boolean descuento) {
        double costoAlquiler = 1;
        double costoTotal = 1;
        if (Moto.getMarca().equalsIgnoreCase("Yamaha")) {
            costoAlquiler = 50000;
        } else {
            costoAlquiler = 60000;
        }
        if (Cliente.getEdad() < 18) {
            costoTotal = 2 *(costoAlquiler * cantidadHoras);
        } else {
            costoTotal = costoAlquiler * cantidadHoras;
        }
        if (descuento) {
            costoTotal -= costoTotal * (ObtenerDescuento() / 100);
        }
        return costoTotal;
    }

    public static HashMap<String, Integer> AnalizarAlquileres(Alquiler[] historia) {
        HashMap<String, Integer> hashMapHistoria = new HashMap<String, Integer>();
        hashMapHistoria.put("18 o menos", 0);
        hashMapHistoria.put("18 - 30", 0);
        hashMapHistoria.put("31 - 40", 0);
        hashMapHistoria.put("41 - 50", 0);
        hashMapHistoria.put("51 o más", 0);

        int cotmenor18 = 0;
        int cot18_30 = 0;
        int cot31_40 = 0;
        int cot41_50 = 0;
        int cotmayor51 = 0;

        for (int i = 0; i < historia.length; i++) {
            if (historia[i].getCliente().getEdad() < 18) {
                cotmenor18 = hashMapHistoria.get("18 o menos") + 1;
                hashMapHistoria.put("18 o menos", cotmenor18);
            } else if (historia[i].getCliente().getEdad() >= 18 && historia[i].getCliente().getEdad() <= 30) {
                cot18_30 = hashMapHistoria.get("18 - 30") + 1;
                hashMapHistoria.put("18 - 30", cot18_30);
            } else if (historia[i].getCliente().getEdad() >= 31 && historia[i].getCliente().getEdad() <= 40) {
                cot31_40 = hashMapHistoria.get("31 - 40") + 1;
                hashMapHistoria.put("31 - 40", cot31_40);
            } else if (historia[i].getCliente().getEdad() >= 41 && historia[i].getCliente().getEdad() <= 50) {
                cot41_50 = hashMapHistoria.get("41 - 50") + 1;
                hashMapHistoria.put("41 - 50", cot41_50);
            } else {
                cotmayor51 = hashMapHistoria.get("51 o más") + 1;
                hashMapHistoria.put("51 o más", cotmayor51);
            }
        }
        return hashMapHistoria;
    }

    private int ObtenerDescuento() {
        if (Cliente.getEdad() < 18) {
            return 0;
        }else if(Cliente.getEdad() <= 40){
            return 2;
        }else{
            return 5;
        }
    }

    @Override
    public String toString() {

        String mensaje = "";
        mensaje = Cliente.getNombre() +" con cédula " + Cliente.getCedula() + " renta la moto " + 
        Moto.getId() + " modelo " + Moto.getModelo()+".";
        return mensaje;
    }
}
