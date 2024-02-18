package parrot;

public class Parrot {

    public static final int MAX_LIVES = 10;
    private static int parrotCount = 0;

String name;

int age; 

int LivesRemaining;

System.out.println("speak");

    public Parrot () {
        parrotCount++;
        int LivesRemaining = MAX_LIVES;
    }

public static int getParrotCount(){
    System.out.println(age);
return parrotCount;
}
}