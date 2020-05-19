package fi.solita.piifaker.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.solita.piifaker.model.*;

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