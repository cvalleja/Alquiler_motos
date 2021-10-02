//package model;

public class MotoAcuatica {
    private String Id;
    private String Modelo;
    private String Marca;

    public MotoAcuatica(String id, String modelo, String marca) {
        super();
        this.Id     = id;
        this.Modelo = modelo;
        this.Marca  = marca;
    }

    public String getId() {
        return Id;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getMarca() {
        return Marca;
    }
}
