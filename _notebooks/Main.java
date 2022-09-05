
public class Main {
  public static void main(String[] args) {
    ClassLoader loader = Main.class.getClassLoader();
    System.out.println(loader.getResource("MenuJFrame.class"));
    new MenuJFrame("Menu");
    System.out.println("Hello World");
  }
}
