/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com11;

import daojuegos.Juegos;
import daojuegos.JuegosRepositorio;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author carlo
 */
@Named(value = "Ingresarlista")
@RequestScoped
public class Ingresarlista extends Juegos {
    

   

    /**
     * Creates a new instance of Ingresar
     */
    public Ingresarlista() {
    }
    
    public String guardarInformacion(){
        JuegosRepositorio.agregarJuegos(this);
        return "verJuegos";
    }
    public String copiarinformacion(){

        
    }
   
    
}
