package com.TallerAbstract.Taller.Domain;

public class Motor {
    private double potenciaMaxima;
    private String noPieza;
    private String tecnologia;


    public Motor(double potenciaMaxima, String noPieza, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.noPieza = noPieza;
        this.tecnologia = tecnologia;
    }

    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(double potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public String getNoPieza() {
        return noPieza;
    }

    public void setNoPieza(String noPieza) {
        this.noPieza = noPieza;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potenciaMaxima='" + potenciaMaxima + '\'' +
                ", noPieza='" + noPieza + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                '}';
    }
}
