package lk.nsbm.construction.manager.controller;

import lk.nsbm.construction.manager.entity.Project;
import lk.nsbm.construction.manager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping(value = "/project")
    public String commentspage(@RequestParam("projectid") String projectId) {
        System.out.println(projectId);
        return "comment";
    }

    @GetMapping("/project/create")
    public String showCreate() {
        return "createproject";
    }


    @PostMapping("/project/create") // //new annotation since 4.3
    public String createProject(@ModelAttribute Project project,RedirectAttributes redirectAttributes) {


        String projectId = projectService.saveProject(project);

        System.out.println(project.getProjectName());
        System.out.println(project.getCreatedBy());



        redirectAttributes.addFlashAttribute("message",
                "Project Created Successfully.  Project ID : " +projectId);

        return "redirect:/uploadStatus";
    }



}
