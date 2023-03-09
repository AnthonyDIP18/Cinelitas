package com.Cinelitas.Cinelitas.controller;

import com.Cinelitas.Cinelitas.entity.Pelicula;
import com.Cinelitas.Cinelitas.entity.Sala;
import com.Cinelitas.Cinelitas.service.IPeliculaService;
import com.Cinelitas.Cinelitas.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class PeliculaController {
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/pelicula")
    public String index(Model model){
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo","Tabla Pelicula");
        model.addAttribute("peliculas", listaPelicula);
        return "peliculas";   
    
    @GetMapping("/peliculaN")
    public String crearPelicula(Model model){
        List<Sala> listaSalas = salaService.listSala();
        model.addAttribute("peliculas", new Pelicula());
        model.addAttribute("Peliculas", listaSalas);
        return "crear";
    }  
    
    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula){
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
    }
    
    @GetMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }
    
    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model){
        Pelicula pelicula = peliculaService.getPeliculaById(idPelicula);
        List<Sala> listaSala = SalaService.listCountry();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("Salas", pelicula);
        return "crear";
    }
    
        
}
}
