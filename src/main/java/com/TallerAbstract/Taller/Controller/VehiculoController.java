package com.TallerAbstract.Taller.Controller;

import com.TallerAbstract.Taller.Domain.IAbstractFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    private IAbstractFactory asbtract;

}
