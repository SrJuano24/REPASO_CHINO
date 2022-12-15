/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;

/**
 *
 * @author Juano
 */
public interface PeliculaService {
    public void crear(Pelicula pelicula) ;
    public List<Pelicula> listar();
    
}
