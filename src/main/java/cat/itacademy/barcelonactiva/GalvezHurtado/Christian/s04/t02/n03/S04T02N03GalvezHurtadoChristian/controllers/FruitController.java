package cat.itacademy.barcelonactiva.GalvezHurtado.Christian.s04.t02.n03.S04T02N03GalvezHurtadoChristian.controllers;

import cat.itacademy.barcelonactiva.GalvezHurtado.Christian.s04.t02.n03.S04T02N03GalvezHurtadoChristian.model.domain.Fruit;
import cat.itacademy.barcelonactiva.GalvezHurtado.Christian.s04.t02.n03.S04T02N03GalvezHurtadoChristian.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class FruitController {//Clase que controla la entity
    @Autowired
    FruitRepository fruitRepository;




    /*http://localhost:8080/fruita/add

    http://localhost:8080/fruita/update

    http://localhost:8080/fruita/delete/{id}

    http://localhost:8080/fruita/getOne/{id}

    http://localhost:8080/fruita/getAll*/

    @PostMapping("/add")
    public String addFruit(@RequestBody Fruit fruitAdd) {
        fruitRepository.save(fruitAdd);
        return "Fruit added: ID/" + fruitAdd.getId();
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable("id") long id, @RequestBody Fruit fruitModify) {
        Optional<Fruit> fruitDataModify = fruitRepository.findById(id);

        if (fruitDataModify.isPresent()) {
            Fruit fruitModifying = fruitDataModify.get();
            fruitModifying.setName(fruitModify.getName());
            fruitModifying.setQuilosQuantity(fruitModify.getQuilosQuantity());
            return "Fruit updated: " + fruitModify.toString();
        } else {
            return "Fruit NOT FOUND";
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteFruit(@PathVariable long id){
        Optional<Fruit> fruitDataDelete = fruitRepository.findById(id);

        if(fruitDataDelete.isPresent()){
            fruitRepository.deleteById(id);
            return "Fruit deleted: ID/" + id;
        }else{
            return "THIS ID NOT EXIST IN DATABASE";
        }


    }

    @GetMapping(value = "/getOne/{id}")
    public Optional<Fruit> getOneFruit(@PathVariable long id){
        return fruitRepository.findById(id);
    }

    @GetMapping(value = "/getAll")
    public List<Fruit> getAllFruits(){
        return fruitRepository.findAll();
    }
}
