import java.util.ArrayList;

public class Apartment {

    //ArrayList<Person> residence = new ArrayList<>();
    int n;//кол-во комнат

    public Apartment(int n) {
        this.n = n;
        Person[] persons = new Person[n];
    }

    public boolean addPerson(Person person) {

        return (residence.isEmpty()) ? residence.add(person) : (!residence.add(person));
    }
}

