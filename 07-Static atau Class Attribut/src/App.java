class Display {
    private String name;
    static String type = "layar";

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Display.type = type;
    }

    Display(String name) {
        this.name = name;

    }

    /// method tanpa return, tanpa parameter
    void show() {
        System.out.println("Nama Display : " + this.name);

    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Display display  = new Display();
        Display.setType("Monitor");
    }
}
