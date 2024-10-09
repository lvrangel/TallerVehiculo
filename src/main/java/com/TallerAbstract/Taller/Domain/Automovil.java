package com.TallerAbstract.Taller.Domain;

import java.time.LocalDate;

public class Automovil {

    private Chasis chasis;
    private Motor motor;
    private Cojineria cojineria;
    private String color;
    private LocalDate fechaEnsamblaje;
    private String numeroEnsamblaje;

    public Automovil() {
    }

    public Automovil(Chasis chasis, Motor motor, Cojineria cojineria, String color, LocalDate fechaEnsamblaje, String numeroEnsamblaje) {
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Cojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(Cojineria cojineria) {
        this.cojineria = cojineria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(LocalDate fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    public String getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public void setNumeroEnsamblaje(String numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
    }
}
