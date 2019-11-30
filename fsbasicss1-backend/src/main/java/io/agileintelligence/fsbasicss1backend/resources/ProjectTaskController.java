package io.agileintelligence.fsbasicss1backend.resources;

import io.agileintelligence.fsbasicss1backend.exceptions.ProjectTaskNotFoundException;
import io.agileintelligence.fsbasicss1backend.model.ProjectTask;
import io.agileintelligence.fsbasicss1backend.repository.ProjectTaskRepository;
import io.agileintelligence.fsbasicss1backend.service.ProjectTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/backlog")
public class ProjectTaskController {

    private final ProjectTaskService projectTaskService;

    @Autowired
    public ProjectTaskController(ProjectTaskService projectTaskService) {
        this.projectTaskService = projectTaskService;
    }

    @PostMapping
    public ResponseEntity createProjectTask(@RequestBody ProjectTask projectTask){
       // return ResponseEntity.created(URI.create("/backlog")).body(projectTaskRepository.save(projectTask));
        return new ResponseEntity(projectTaskService.save(projectTask), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity findAllProjectTasks(){
        return ResponseEntity.ok(projectTaskService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity findProjectTaskById(@PathVariable Long id){
        return ResponseEntity.ok(projectTaskService.findById(id));
    }



}
