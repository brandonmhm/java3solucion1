/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author brandon
 */
@Controller
@RequestMapping("reservaciones")
public class ControladorReservaciones {

     @RequestMapping("/guardar")
     @ResponseBody String guardar()throws Exception{
         DAOReservacion daor=new DAOReservacion();
     DAOCliente daoc=new DAOCliente();
     DAOTarjeta daot=new DAOTarjeta();
     Cliente c1=new Cliente();
     c1.setEmail("brandon@hotmail.com");
     c1.setNombre("brandon");
     c1.setAPaterno("hernandez");
     daoc.guadar(c1);
     
     Tarjeta t1=new Tarjeta();
     t1.setIdCliente(c1);
     t1.setNombreTarjeta("bancomer");
     t1.setNumTarjeta(13619262);
     t1.setSaldo(150000f);
     daot.guadar(t1);

     
     
     Reservacion reservacion=new Reservacion();
     reservacion.setIdCliente(c1);
     reservacion.setIdTarjeta(t1);
     
     daor.guadar(reservacion);
     
     
        return "reservacion guardada con exito";
     }
    
}
