package Localclass;

public class Demo4 {

    void displayPerson() {
        // Method-local inner class
        abstract class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            abstract void getDetail();
        }

        // Concrete implementation using an anonymous inner class
        Person person = new Person("John", 25) {
            @Override
            void getDetail() {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
            }
        };

        // Using the instance
        person.getDetail();
    }

    public static void main(String[] args) {
        Demo4 example = new Demo4();
        example.displayPerson();
    }
}
