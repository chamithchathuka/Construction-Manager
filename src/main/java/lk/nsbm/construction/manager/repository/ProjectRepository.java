package lk.nsbm.construction.manager.repository;

import lk.nsbm.construction.manager.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Integer> {

}
