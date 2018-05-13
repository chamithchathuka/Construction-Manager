package lk.nsbm.construction.manager.service;

import lk.nsbm.construction.manager.entity.Project;
import lk.nsbm.construction.manager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lk.nsbm.construction.manager.util.UtilCollection;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;




    public String saveProject(Project project){

        Project projectCreated  = projectRepository.save(project);

          String  projectid = projectCreated.getProjectId()+"";
          return  projectid;


    }

    public List<Project> findAll(){

        Iterable<Project> all = projectRepository.findAll();

        return UtilCollection.makeCollection(all);

    }




}
