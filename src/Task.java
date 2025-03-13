import java.util.ArrayList;
import java.util.List;

public class Task {
    private String id;
    private String name;
    private String description;

    public Task(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    List<Person> persons = new ArrayList<>();

    public void addPersonToTask(Person person) {
       persons.add(person);
    }

    public void sendNotificationToPersons(String message) {
        for (Person person : persons) {
            person.getNotification(message);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        sendNotificationToPersons("Task ID has been updated to " + id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        sendNotificationToPersons("Task name has been updated to " + name);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        sendNotificationToPersons("Task description has been updated to " + description);
    }


    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
