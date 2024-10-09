package com.TallerAbstract.Taller.Domain;

public class Cojineria {

    private int noPiezas;
    private String materialDeFabricacion;

    public Cojineria(int noPiezas, String materialDeFabricacion) {
        this.noPiezas = noPiezas;
        this.materialDeFabricacion = materialDeFabricacion;
    }

    public int getNoPiezas() {
        return noPiezas;
    }

    public void setNoPiezas(int noPiezas) {
        this.noPiezas = noPiezas;
    }

    public String getMaterialDeFabricacion() {
        return materialDeFabricacion;
    }

    public void setMaterialDeFabricacion(String materialDeFabricacion) {
        this.materialDeFabricacion = materialDeFabricacion;
    }

    @Override
    public String toString() {
        return "Cojineria{" +
                "noPiezas='" + noPiezas + '\'' +
                ", materialDeFabricacion='" + materialDeFabricacion + '\'' +
                '}';
    }
}
