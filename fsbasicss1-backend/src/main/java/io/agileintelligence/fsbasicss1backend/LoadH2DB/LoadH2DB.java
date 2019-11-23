package io.agileintelligence.fsbasicss1backend.LoadH2DB;

import io.agileintelligence.fsbasicss1backend.model.ProjectTask;
import io.agileintelligence.fsbasicss1backend.repository.ProjectTaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LoadH2DB {

    @Bean
    CommandLineRunner loadH2DBSampleData(ProjectTaskRepository projectTaskRepository){
        return args -> {
            projectTaskRepository.save(new ProjectTask("UserStory", "sample story","sample description","IN_PROGRESS"));
            projectTaskRepository.save(new ProjectTask("Task", "sample task","sample description for Task","TO_DO"));
            projectTaskRepository.save(new ProjectTask("Bug", "sample but","sample description for a Bug","DONE"));
        };
    }

}
