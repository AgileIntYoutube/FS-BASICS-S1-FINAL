package io.agileintelligence.fsbasicss1backend.service;

import io.agileintelligence.fsbasicss1backend.exceptions.ProjectTaskNotFoundException;
import io.agileintelligence.fsbasicss1backend.model.ProjectTask;
import io.agileintelligence.fsbasicss1backend.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    private final ProjectTaskRepository projectTaskRepository;

    @Autowired
    public ProjectTaskService(ProjectTaskRepository projectTaskRepository) {
        this.projectTaskRepository = projectTaskRepository;
    }


    public Iterable findAll() {
        return projectTaskRepository.findAll();
    }


    public ProjectTask findById(Long id) {
        return projectTaskRepository.findById(id)
                .orElseThrow(()-> new ProjectTaskNotFoundException("Project Task not found"));
    }


    public ProjectTask save(ProjectTask projectTask) {
        return projectTaskRepository.save(projectTask);
    }


    public ProjectTask update(Long id, ProjectTask projectTask) {

        return null;
    }


    public void delete(Long id) {
    //empty
    }


}
