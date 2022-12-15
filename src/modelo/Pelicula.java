/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Juano
 */
public class Pelicula {
  private String pelicula;
  private int yearLazamiento;
  private String idioma;
  private double duracuion;
  private String clasificacion;
  private int codigo;

    public Pelicula(String pelicula, int yearLazamiento, String idioma, double duracuion, String clasificacion, int codigo) {
        this.pelicula = pelicula;
        this.yearLazamiento = yearLazamiento;
        this.idioma = idioma;
        this.duracuion = duracuion;
        this.clasificacion = clasificacion;
        this.codigo = codigo;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getYearLazamiento() {
        return yearLazamiento;
    }

    public void setYearLazamiento(int yearLazamiento) {
        this.yearLazamiento = yearLazamiento;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public double getDuracuion() {
        return duracuion;
    }

    public void setDuracuion(double duracuion) {
        this.duracuion = duracuion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int añosPelicula(){
    var retorno= LocalDate.now().getYear()-this.yearLazamiento;
        return retorno;
    
    
    } 
    
    
    
    
    @Override
    public String toString() {
        return "Pelicula{" + "pelicula=" + pelicula + ", yearLazamiento=" + 
                yearLazamiento + ", idioma=" + idioma + ", duracuion=" 
                + duracuion + ", clasificacion=" + clasificacion
                + ", codigo=" + codigo+"año de publicacion"
                +this.añosPelicula()+ "} \n";
    }
  
 
  
          
}
