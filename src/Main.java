public class Main {
    public static void main(String[] args) {
        Task task = new Task("1", "Backend", "Description 1");
        Person person1 = new Person("1", "Vinh", "vinh@gmail.com");
        Person person2 = new Person("2", "Hai", "hai@gmail.com");
        task.addPersonToTask(person1);
        task.addPersonToTask(person2);

        task.setName("Frontend");

    }
}