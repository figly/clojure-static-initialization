package clojure_static_initialization;

public class Demo {
  static {
    System.out.println("Running static initializers!");
  }
  public Demo () {
  }
}
