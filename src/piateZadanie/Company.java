package piateZadanie;

public class Company {
    public static void main(String[] args) {

        Employee firstEmployee = new Employee();
        firstEmployee.firstName = "Kacper";
        firstEmployee.lastName = "Orzechowski";
        firstEmployee.birthYear = 2000;
        firstEmployee.seniority = 2;

        Employee secondEmployee = new Employee();
        secondEmployee.firstName = "Filip";
        secondEmployee.lastName = "Orzechowski";
        secondEmployee.birthYear = 2013;
        secondEmployee.seniority = 1;

        Employee thirdEmployee = new Employee();
        thirdEmployee.firstName = "Frajer";
        thirdEmployee.lastName = "XDDD";
        thirdEmployee.birthYear = 1991;
        thirdEmployee.seniority = 13;

        System.out.println("Pracownicy w firmie: ");

        System.out.println(firstEmployee.firstName + " " + firstEmployee.lastName + " urodził się w " + firstEmployee.birthYear
                + " roku" + " a jego staż to " + firstEmployee.seniority + " lat.");

        System.out.println(secondEmployee.firstName + " " + secondEmployee.lastName + " urodził się w " + secondEmployee.birthYear
                + " roku" + " a jego staż to " + secondEmployee.seniority + " lat.");

        System.out.println(thirdEmployee.firstName + " " + thirdEmployee.lastName + " urodził się w " + thirdEmployee.birthYear
                + " roku" + " a jego staż to " + thirdEmployee.seniority + " lat.");


    }



}
