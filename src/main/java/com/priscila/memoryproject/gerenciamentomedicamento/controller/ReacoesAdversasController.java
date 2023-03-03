package com.priscila.memoryproject.gerenciamentomedicamento.controller;

import com.priscila.memoryproject.gerenciamentomedicamento.service.ReacoesAdversasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe: Reações Adversas Controller.
 */

@RestController
@RequestMapping(value = "/reacoesadversas")
public class ReacoesAdversasController {
  @Autowired
  private ReacoesAdversasService reacoesAdversasService;
}

//@RestController
//@RequestMapping(value = "/series")
//public class MinhasSeriesController {
//  @Autowired
//  private MinhasSeriesService minhasSeriesService;
//
//  @GetMapping
//  public List<Serie> findAll() {
//    return minhasSeriesService.findAll();
//  }
//
//  @PostMapping
//  public Serie save(@RequestBody Serie serie) {
//    return minhasSeriesService.save(serie);
//  }
//
//  @DeleteMapping(value = "/{id}")
//  public void delete(@PathVariable("id") Integer id) {
//    minhasSeriesService.delete(id);
//  }
//
//  @PostMapping(value = "/{id}/episodios")
//  public Serie addEpisode(@PathVariable Integer id, @RequestBody Episodio episodio) {
//    return minhasSeriesService.addEpisode(id, episodio);
//  }
//
//  @GetMapping(value = "/{id}/episodios")
//  public List<Episodio> listar(@PathVariable("id") Integer id) {
//    return minhasSeriesService.listar(id);
//  }
//
//  @GetMapping(value = "/tempo")
//  public Map<String, Integer> tempoEmMinutos() {
//    return minhasSeriesService.tempoEmMinutos();
//  }
//}
