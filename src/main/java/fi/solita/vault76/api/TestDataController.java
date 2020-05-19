package fi.solita.vault76.api;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.solita.vault76.model.*;

@RestController
public class TestDataController {

    private  TestDataService testDataService;

    @Autowired 
    public TestDataController(TestDataService testDataService) {
        this.testDataService = testDataService;
    }

    @GetMapping("/person")
    public Person generateTestPerson() {
        return testDataService.generateTestPerson();
    }
}