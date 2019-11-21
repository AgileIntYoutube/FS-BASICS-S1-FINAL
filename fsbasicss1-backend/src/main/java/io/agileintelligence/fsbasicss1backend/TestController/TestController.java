package io.agileintelligence.fsbasicss1backend.TestController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String testMethod(){
        return "This is a sample response";
    }

    @GetMapping("/queryp")
    public String queryParam(@RequestParam(value="carlos")String reqParam){
        return reqParam;
    }

    @GetMapping("/{pv}/pathv")
    public String pathVar(@PathVariable String pv){
        return pv;
    }

    @GetMapping("/pathv/{pv}")
    public String pathVar2(@PathVariable String pv){
        return pv;
    }


}
