package training.day5;

class Person {
    String name;
    String gender;
    int id;

    public Person(String name, String gender, int id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }
}