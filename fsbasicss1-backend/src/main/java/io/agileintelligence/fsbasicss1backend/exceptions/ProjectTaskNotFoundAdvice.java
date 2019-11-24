package io.agileintelligence.fsbasicss1backend.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ProjectTaskNotFoundAdvice {


    @ResponseBody
    @ExceptionHandler(ProjectTaskNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String ProjectTaskNotFoundHandler(ProjectTaskNotFoundException ex){
        return ex.getMessage();
    }

}
