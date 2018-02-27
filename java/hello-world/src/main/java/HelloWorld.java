public class HelloWorld {
  public static String hello(String name) {
    String retVal = "";
    if (name == null || name.equals("")) {
      retVal = "World";
    } else {
      retVal = name;
    }
    return String.format("Hello, %s!", retVal);
  }
}
