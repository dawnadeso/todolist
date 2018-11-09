import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class TodoList {
    /*
     * Add a new item to the list, given a description and priority.
     * 
     * 
     */
	List <String> TodoList = new ArrayList<String>();
	
	
    public void addItem(String description, int priority) {
    	//items.put(description, priority); 
    	//TodoList.set(priority, description);
    	//String string = (String);
    	Map <String, Integer> items = new HashMap<>();
    	items.put(description, priority);
    	TodoList.add(description);
    	TodoList.add(priority, description);
    	
    	
    	
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        // TODO
        return null;
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        // TODO
        return 0;
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        // TODO
        return null;
    }
}
