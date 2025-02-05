package duke.task;

/**
 * Todo task.
 */
public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }
    /**
     * Constructor for <code>Todo</code>.
     *
     * @param description
     */
    public Todo(String description, String tag) {
        super(description, tag);
    }

    /**
     * String representative of Todo.
     *
     * @return String representative of Todo for displaying
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    /**
     * Convert a Todo task to a String to store with Storage.
     *
     * @return String representative of Todo for storing
     */
    @Override
    public String toMemoryString() {
        return "T" + super.toMemoryString();
    }
}
