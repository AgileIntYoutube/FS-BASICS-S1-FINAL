package io.agileintelligence.fsbasicss1backend.resources;

import io.agileintelligence.fsbasicss1backend.model.ProjectTask;
import io.agileintelligence.fsbasicss1backend.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/backlog")
public class ProjectTaskController {

    private final ProjectTaskRepository projectTaskRepository;

    @Autowired
    public ProjectTaskController(ProjectTaskRepository projectTaskRepository) {
        this.projectTaskRepository = projectTaskRepository;
    }

    @PostMapping
    public ResponseEntity createProjectTask(@RequestBody ProjectTask projectTask){

       // return ResponseEntity.created(URI.create("/backlog")).body(projectTaskRepository.save(projectTask));
        return new ResponseEntity(projectTaskRepository.save(projectTask), HttpStatus.CREATED);
    }


}
