import java.util.ArrayList;
import java.util.List;

class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nCompleted: " + completed + "\n";
    }
}

public class TodoList {
    private List<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + ":");
            System.out.println(tasks.get(i));
        }
    }

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("Study for exam", "Prepare notes and review materials"));
        todoList.addTask(new Task("Buy groceries", "Milk, bread, eggs, vegetables"));
        todoList.addTask(new Task("Exercise", "Go for a run or do yoga"));
        todoList.displayTasks();
    }
}
