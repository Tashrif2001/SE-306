package lab1;

import java.util.*;

public class UserList {
	private PriorityQueue<User>queue;
	
	public UserList() {
		queue = new PriorityQueue<>(new AlphaComparator());
	}
	
	public void add(User user) {
		queue.add(user);
	}
	
	public void checkDuplicate() {
		Set<String>lists = new HashSet<>();
		
		for(User user : queue) {
			lists.add(String.format("%s", user.getUserName()+","+user.getId()));
		}
		queue.clear();
		Iterator<String>it = lists.iterator();
		
		while(it.hasNext()) {
			String temp = it.next();
			String arr[] = temp.split(",");
			User u1 = new User(arr[0], Integer.parseInt(arr[1]));
			queue.offer(u1);
		}
	}
	public void display() {
		List<User>lists = new ArrayList<>(queue);
		
		for(User user : lists) {
			System.out.printf("%s %d\n", user.getUserName(), user.getId());
		}
		lists.clear();
	}
}
