package com.TallerAbstract.Taller.Domain;

public interface IAbstractFactory {

    Chasis CrearChasis();
    Motor CrearMotor();
    Cojineria CrearCojines();
    Automovil Esamblar(String color, String numeroEsamblaje);

}
