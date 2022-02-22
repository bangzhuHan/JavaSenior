package Collection.Test;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NAME:" + name + "\t" + "AGE:" + age;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Person equals()...");
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass())return false;

        Person person = (Person) obj;
        if(age != person.age)return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }
}
