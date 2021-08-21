package br.com.spring.apirestdemo.controller;

import java.util.List;

import br.com.spring.apirestdemo.models.ObjColor;
import br.com.spring.apirestdemo.service.ObjColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    //private IObjColorRepository objColorRepository;

    @Autowired // injection
    private ObjColorService objColorService;

    @GetMapping
    public ResponseEntity<List<ObjColor>> getAllObjColor() {
        return ResponseEntity.ok().body(objColorService.getAllObjColor());
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<ObjColor> getColorById(@PathVariable long id) {
        return ResponseEntity.ok().body(objColorService.getColorById(id));
    }

    @PostMapping
    public ResponseEntity<ObjColor> createObjColor(@RequestBody ObjColor objColor) {
        return ResponseEntity.ok().body(this.objColorService.createObjColor(objColor));
    }

    @PutMapping(path="/{id}")
    public ResponseEntity<ObjColor> updateObjColor(@PathVariable long id, @RequestBody ObjColor objColor) {
        objColor.setId(id);
        return ResponseEntity.ok().body(this.objColorService.updateObjColor(objColor));
    }

    @DeleteMapping(path="/{id}")
    public HttpStatus deleteObjColor(@PathVariable long id) {
        this.objColorService.deleteObjColor(id);
        return HttpStatus.OK;
    }
}
    /*
    @GetMapping
        public String hello() {
        return "Hello word";
    }*/

    // @GetMapping
   //  public List<ObjColor> List(){
   //  return objColorRepository.findAll();

    /*@GetMapping(path="/{word}")
    public String list(@PathVariable String word){
        word=word.toUpperCase(Locale.ROOT);
        String cor = "COR";
        String objeto = "OBJETO";
        switch (word){
            case "AMARELO":
            case" VERMELHO":
            case "BRANCO":
            case "PRETO":
            case "AZUL":
            case "CINZA":
            case "VERDE":
                return cor;
            default: return objeto;
        }
        if (word == cor) {
           bjColorRepository.save(word);
        }*/


    /*@PostMapping
    @ResponseStatus(HttpStatus.CREATED) // return the code 201 when created
    public ObjColor add(@RequestBody ObjColor word){
        return objColorRepository.save(word);
    }

}*/
