package mongo.app.repository;

import mongo.app.entity.projects.Projects;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProjectsRepository extends MongoRepository<Projects, String> {
}
