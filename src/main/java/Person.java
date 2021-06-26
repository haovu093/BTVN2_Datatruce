public class Person {
    String name;
    String nationality;
    int age;
    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " +
                nationality + " - " +
                age;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int compareTo(Person person) {
        if (age == person.age)
            return 0;
        else if (age > person.age)
            return 1;
        else
            return -1;
    }
}

