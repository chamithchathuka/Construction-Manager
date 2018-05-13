package lk.nsbm.construction.manager.repository;

import lk.nsbm.construction.manager.entity.StatusUpdate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionStateRepo extends CrudRepository<StatusUpdate,Integer> {

}
