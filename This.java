public class This {
    private String name;

    public This(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        This obj = new This("Example");
        obj.printName();
    }
}