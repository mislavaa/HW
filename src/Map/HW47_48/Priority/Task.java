package Map.HW47_48.Priority;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private String category;

    public Task(String name, int priority, String category) {
        this.name = name;
        setPriority(priority);
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority <= 3 && priority >= 1) {
            this.priority = priority;
        } else {
            this.priority = 3;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority == task.priority && Objects.equals(name, task.name) && Objects.equals(category, task.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority, category);
    }

    @Override
    public int compareTo(Task o) {
        if (this.priority == o.priority) {
            return category.compareTo(o.category);
        } else {
            return Integer.compare(this.priority, o.priority);
        }
    }

    @Override
    public String toString() {
        return "name = '" + name + "', priority = " + priority + ", category = " + category;
    }
}
