//package model;

public class Persona {

    private String Cedula;
    private int Edad;
    private String Nombre;

    public Persona() {
        super();
    }

    public Persona(String cedula, int edad, String nombre) {
        super();
        this.Cedula = cedula;
        this.Edad   = edad;
        this.Nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public String getNombre() {
        return Nombre;
    }
}
