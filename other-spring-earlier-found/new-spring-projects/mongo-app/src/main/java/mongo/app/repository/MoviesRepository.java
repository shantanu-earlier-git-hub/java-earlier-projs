package mongo.app.repository;

import mongo.app.entity.movies.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MoviesRepository extends MongoRepository<Movies, String> {





}
