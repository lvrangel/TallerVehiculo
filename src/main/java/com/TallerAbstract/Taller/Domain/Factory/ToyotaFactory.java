package com.TallerAbstract.Taller.Domain.Factory;

import com.TallerAbstract.Taller.Domain.*;

public class ToyotaFactory implements IAbstractFactory {

    @Override
    public Chasis CrearChasis() {
        return new CToyota();
    }

    @Override
    public Motor CrearMotor() {
        return new MotorToyota(2000,"MTT001","Automatico");
    }

    @Override
    public Cojineria CrearCojines() {
        return new SToyota(2,"Cuero");
    }

    @Override
    public Automovil Esamblar(String color, String numeroEsamblaje) {

        Chasis chasis = CrearChasis();
        Motor motor = CrearMotor();
        Cojineria cojineria = CrearCojines();

        Automovil automovil = new Automovil();
        automovil.setChasis(chasis);
        automovil.setMotor(motor);
        automovil.setCojineria(cojineria);
        automovil.setColor(color);
        automovil.setFechaEnsamblaje(java.time.LocalDate.now());
        automovil.setNumeroEnsamblaje(numeroEsamblaje);

        return automovil;
    }
}
