package cat.itacademy.barcelonactiva.GalvezHurtado.Christian.s04.t02.n03.S04T02N03GalvezHurtadoChristian.model.repository;

import cat.itacademy.barcelonactiva.GalvezHurtado.Christian.s04.t02.n03.S04T02N03GalvezHurtadoChristian.model.domain.Fruit;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface FruitRepository extends MongoRepository<Fruit, Long> {

}
