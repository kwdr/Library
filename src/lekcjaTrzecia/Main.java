package lekcjaTrzecia;

public class Main {

    public static void main(String[] args) {

        String firstName = "Kacper";
        String lastName = "Orzechowski";
        final String pesel = "123123123123";
        int age = 17;
        double height = 185.5;

        System.out.print("Cześć " + firstName + " " + lastName);

        System.out.println(" poniżej jest kilka informacji o Tobie:");
        System.out.println("Twój PESEL to: " + pesel);
        System.out.println("Masz " + age + " lat");

        System.out.println("Twój wzrost to:" + height + "cm");
    }
}

class Welcome {

    public static void main(String[] args) {

        String firstName = "Kacper";
        String lastName = "Orzechowski";

        System.out.println("Cześć " + firstName);
        System.out.println("W naszej bazie istnieje " + firstName + " " + lastName);
        System.out.println("Czy " + firstName + " " + lastName + " to Ty?");
    }
}