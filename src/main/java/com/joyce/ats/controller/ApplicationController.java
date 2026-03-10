package com.joyce.ats.controller;

import com.joyce.ats.entity.Application;
import com.joyce.ats.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @PostMapping
    public Application createApplication(@RequestBody Application application) {
        return applicationService.saveApplication(application);
    }
    @PutMapping("/{id}")
    public Application updateApplication(@PathVariable Long id, @RequestBody Application application) {
        return applicationService.updateApplication(id, application);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
    }
}
