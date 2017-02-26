package helloworld;

public class HelloWorld {

    public enum LANGUAGE {
        FR, EN
    };

    public static void main(String[] args) {
    }

    public String sayHello(LANGUAGE... lang) {
        if (lang != null && lang.length > 0 && lang[0].equals(LANGUAGE.FR)) {
            return "Bonjour tout le monde";
        }
        return "hello world";
    }

    public String sayHello(String name, LANGUAGE... lang) {
        if (lang != null && lang.length > 0 && lang[0].equals(LANGUAGE.FR)) {
            return "Bonjour " + name;
        }
        return "hello " + name;
    }

    public String sayHello(String name, String temperature, LANGUAGE... lang) {
        if (lang != null && lang.length > 0 && lang[0].equals(LANGUAGE.FR)) {
            return "Bonjour " + name+ ". Il fait " + temperature + " aujourd'hui";
        }
        return "Hello " + name+ ". It is " + temperature + " today.";
    }
}
