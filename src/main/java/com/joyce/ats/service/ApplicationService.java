package com.joyce.ats.service;

import com.joyce.ats.entity.Application;
import com.joyce.ats.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

    public Application updateApplication(Long id, Application updatedApplication) {
        Application existingApplication = applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));

        existingApplication.setCompany(updatedApplication.getCompany());
        existingApplication.setPosition(updatedApplication.getPosition());
        existingApplication.setStatus(updatedApplication.getStatus());
        existingApplication.setAppliedDate(updatedApplication.getAppliedDate());

        return applicationRepository.save(existingApplication);
    }
    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }
}
