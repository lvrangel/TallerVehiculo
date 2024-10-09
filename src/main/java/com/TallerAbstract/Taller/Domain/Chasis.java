package com.TallerAbstract.Taller.Domain;

public class Chasis {

    private String noEjes;
    private String noPieza;
    private String tipoTransmision;

    public Chasis(String noEjes, String noPieza, String tipoTransmision) {
        this.noEjes = noEjes;
        this.noPieza = noPieza;
        this.tipoTransmision = tipoTransmision;
    }

    public String getNoEjes() {
        return noEjes;
    }

    public void setNoEjes(String noEjes) {
        this.noEjes = noEjes;
    }

    public String getNoPieza() {
        return noPieza;
    }

    public void setNoPieza(String noPieza) {
        this.noPieza = noPieza;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public String toString() {
        return "Chasis{" +
                "noEjes='" + noEjes + '\'' +
                ", noPieza='" + noPieza + '\'' +
                ", tipoTransmision='" + tipoTransmision + '\'' +
                '}';
    }
}
