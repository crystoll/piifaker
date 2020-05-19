package fi.solita.piifaker.api;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import fi.solita.piifaker.model.*;
import org.springframework.stereotype.Service;

@Service
public class TestDataService {
    private List<String> MALE_FIRST_NAMES = new ArrayList<String>();
    private List<String> FEMALE_FIRST_NAMES = new ArrayList<String>();
    private List<String> LAST_NAMES = new ArrayList<String>();
    private List<String> STREET_NAMES = new ArrayList<String>();
    private List<String> EMAIL_DOMAINS = new ArrayList<String>();

    private Random randomGenerator;

    public TestDataService() {
        randomGenerator = new Random();
        MALE_FIRST_NAMES.add("Duck");
        MALE_FIRST_NAMES.add("Chuck");
        MALE_FIRST_NAMES.add("Bob");
        MALE_FIRST_NAMES.add("Jack");
        MALE_FIRST_NAMES.add("Bill");
        MALE_FIRST_NAMES.add("Alexander");
        MALE_FIRST_NAMES.add("Peter");
        FEMALE_FIRST_NAMES.add("Elizabeth");
        FEMALE_FIRST_NAMES.add("Pia");
        FEMALE_FIRST_NAMES.add("Tia");
        FEMALE_FIRST_NAMES.add("Mary");
        FEMALE_FIRST_NAMES.add("Deborah");
        FEMALE_FIRST_NAMES.add("Selina");
        FEMALE_FIRST_NAMES.add("Annie");
        LAST_NAMES.add("Duck");
        LAST_NAMES.add("Scrooge");
        LAST_NAMES.add("O'Malley");
        LAST_NAMES.add("Johnson");
        LAST_NAMES.add("Roosevelt");
        LAST_NAMES.add("Dumas");
        STREET_NAMES.add("Duckland");
        STREET_NAMES.add("Avenue 5");
        EMAIL_DOMAINS.add("gmail.com");
        EMAIL_DOMAINS.add("hotmail.com");
        EMAIL_DOMAINS.add("live.com");
    }
    
    

    private String randomValue(List<String> list)
    {
        return list.get(randomGenerator.nextInt(list.size()));
    }

    private String randomStreetname() {
        return randomValue(STREET_NAMES) + " " + randomGenerator.nextInt(30);
    }

    private Sex randomSex() {
        int sex = randomGenerator.nextInt(2);
        if (sex == 0) return Sex.MALE;
        else return Sex.FEMALE;
    }

    public String randomFirstName(Sex sex) {
        if (sex == Sex.MALE) return randomValue(MALE_FIRST_NAMES);
        else return randomValue(FEMALE_FIRST_NAMES);
    }
    public String randomLastName() {
        return randomValue(LAST_NAMES);
    }
    public String randomEmailAddress(String firstName, String lastName) {
        return new StringBuilder()
        .append(firstName.toLowerCase())
        .append(".")
        .append(lastName.toLowerCase())
        .append("@")
        .append(randomValue(EMAIL_DOMAINS))
        .toString();
    }

    public PersonRecord generateTestPerson() {
        Sex sex = randomSex();
        var address = new AddressRecord(randomStreetname(), "Duckland", "111111", "Duck-Country");
        String firstName = randomFirstName(sex);
        String lastName = randomLastName();
        String emailAddress = randomEmailAddress(firstName, lastName);
        return new PersonRecord(sex, firstName, lastName, emailAddress, LocalDate.now(), "111111-111A", address);
    }
}