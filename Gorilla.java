package gorilla;

public class Main {
    public static void main(String[] args) {
        System.out.println(Gorilla.getGorrillaCount());
        Gorilla bigGorilla = new Gorilla();
bigGorilla.shout();
bigGorilla.name = "Tim";
bigGorilla.age = 2;
System.out.println(Gorilla.MAX_LIVES);
System.out.println(Gorilla.getGorrillaCount());
    }
}