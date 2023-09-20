package com.bailu.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> femalePeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePeople.add(person);
            }
        }
        return femalePeople;
    }
}
