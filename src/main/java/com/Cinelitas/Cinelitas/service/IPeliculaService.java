/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cinelitas.Cinelitas.service;

import com.Cinelitas.Cinelitas.entity.Pelicula;
import java.util.List;

/**
 *
 * @author Anthony
 */
public interface IPeliculaService {
    public List<Pelicula> getAllPelicula();
    public Pelicula getPeliculaById (long id);
    public void savePelicula(Pelicula pelicula);
    public void delete (long id);
}
