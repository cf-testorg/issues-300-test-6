package com.frappuccino.nice.ruletest.squid.noncompliant;

import com.frappuccino.nice.ruletest.squid.compliant.CloneableTest;
import com.frappuccino.nice.ruletest.squid.compliant.Person;
import java.util.List;

public class S2157Rule implements CloneableTest {

    private Person coach;
    private List<Person> players;

    public void addPlayer(Person p) {
        Person p1 = p;
        System.out.println(p1);
    }

    public Person getCoach() {
        return new Person();
    }

}
