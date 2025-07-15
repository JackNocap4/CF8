package gr.aueb.cf.ch12;

public class StudentMain {

    public static void main(String[] args) {

        Student alice = new Student();   // id = 0; firstname = null; lastname = null;
        Student jimmy = new Student(2, "Jimmy", "B.");

        alice.setId(10);               // set id αλλάξαμε alice.id = 10 γτ είναι private.
        alice.setFirstname("Alice");    // set firstname
        alice.setLastname("W.");       // set lastname


        System.out.println("ID: " + alice.getId());                     // get id    άλλαξε + alice.id
        System.out.println("Firstname: " + alice.getFirstname());      // get firstname
        System.out.println("Lastname: " + alice.getLastname());       //get lastname
        System.out.println("ID: " + jimmy.getId());
        System.out.println("Firstname: " + jimmy.getFirstname());
        System.out.println("Lastname: " + jimmy.getLastname());

        jimmy.setLastname("Dylan");


    }
}
