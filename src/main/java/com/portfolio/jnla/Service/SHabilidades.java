/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnla.Service;

import com.portfolio.jnla.Entity.Habilidades;
import com.portfolio.jnla.Repository.RHabilidades;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidades {
    @Autowired
    RHabilidades rHabilidades;
    
     public List<Habilidades> list(){
         return rHabilidades.findAll();
     }
     
     public Optional<Habilidades> getOne(int id){
         return rHabilidades.findById(id);
     }
     
     public Optional<Habilidades> getByNombreHab(String nombreHab){
         return rHabilidades.findByNombreHab(nombreHab);
     }
     
     public void save(Habilidades habilidades){
         rHabilidades.save(habilidades);
     }
     
     public void delete(int id){
         rHabilidades.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rHabilidades.existsById(id);
     }
     
     public boolean existsByNombreHab(String nombreHab){
         return rHabilidades.existsByNombreHab(nombreHab);
     }
}
