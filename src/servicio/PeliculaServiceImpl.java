/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;

/**
 *
 * @author Juano
 */
public class PeliculaServiceImpl implements PeliculaService {
private  List<Pelicula> PeliculaList;
    public PeliculaServiceImpl(){
        this.PeliculaList= new ArrayList<>();
    
    }
    @Override
    public void crear(Pelicula pelicula) {
        this.PeliculaList.add(pelicula);
    }

    @Override
    public List<Pelicula> listar() {
        return this.PeliculaList ;
    }
    
}
