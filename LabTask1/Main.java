package lab1;

public class Main {
	public static void main(String[] args) {
		UserList u = new UserList();
		
		User u1 = new User("tashrif", 12);
		User u2 = new User("ismail", 34);
		User u3 = new User("sami", 56);
		User u4 = new User("tashrif", 12);
		
		u.add(u1);
		u.add(u2);
		u.add(u3);
		u.add(u4);
		u.checkDuplicate();
		u.display();
	}
}
