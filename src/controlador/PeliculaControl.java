/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Pelicula;
import servicio.PeliculaServiceImpl;

/**
 *
 * @author Juano
 */
public class PeliculaControl {
    private PeliculaServiceImpl peliculaServiceImpl;
    public PeliculaControl (){
        this.peliculaServiceImpl= new PeliculaServiceImpl();
    
    }
    
    
    
    public String crear(String[] args){
        var pelicula=args[0];
    var yearLazamiento=Integer.valueOf(args[1]);
  var idioma=args[2];
  var duracuion= Double.valueOf(args[3]).doubleValue();;
  var clasificacion=args[4];
  var  codigo=Integer.valueOf(args[5]);
      
    var peliculin= new Pelicula(pelicula,yearLazamiento,idioma,duracuion,clasificacion,codigo);
    this.peliculaServiceImpl.crear(peliculin);
    return "Ta bien";
    }
    public List<Pelicula> listar(){
    return this.peliculaServiceImpl.listar();
    
    }
}
