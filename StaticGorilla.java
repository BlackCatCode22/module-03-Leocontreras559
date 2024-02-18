package gorilla;

public class Gorilla {

    public static final int MAX_LIVES = 15;
    private static int gorillaCount = 0;

String name;

int age; 

int LivesRemaining;

System.out.println("Shout");

    public Gorilla () {
        gorillaCount++;
        int LivesRemaining = MAX_LIVES;
    }

public static int getGorrillaCount(){
    System.out.println(age);
return gorillaCount;
}
}