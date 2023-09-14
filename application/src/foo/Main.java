package foo;
import test.User;
public class Main {
  public static void main(String[] args) {
    User user = new User("Joe");
    System.out.println(user.getName());
  }
}
