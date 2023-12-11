package _9_equals_and_hashcode;

// has overridden equals and hashCode methods

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        // first if statement checks if the object is compared to itself
        if (this == obj) {
            return true;
        }

        // second if statement checks if the object is null or
        // if the object is not an instance of Person class
        if (obj == null || !(obj instanceof Person2)) {
            return false;
        }

        // if the object is not null and is an instance of Person class
        // then cast the object to Person class
        Person2 person = (Person2) obj;

        // compare the fields of the object
        return name == person.name ? age == person.age ? true : false : false;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

}

