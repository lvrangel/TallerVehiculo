package com.TallerAbstract.Taller.Domain.Factory;

import com.TallerAbstract.Taller.Domain.*;

public class MazdaFactory implements IAbstractFactory{
    @Override
    public Chasis CrearChasis() {
        return new CMazda();
    }

    @Override
    public Motor CrearMotor() {
        return new MotorMazda(2000,"MTM003","Automatico");
    }

    @Override
    public Cojineria CrearCojines() {
        return new SMazda(4,"Tela");
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
