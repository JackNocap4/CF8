package gr.aueb.cf.ch12;

/**
 * Very simple data class.
 *private fields, default constructor και
 * getters και setters με convention
 * ονομάζονται JavaBean.
 */
public class Student {

    private int id; // το default είναι package private.
    private String firstname;
    private String lastname;


    /*
    *  default contstuctor
     */
    public Student() {
       // Δεξί κλικ, Generate. Για constuctor και getters και setters. Αρχικοποιεί σε Default τιμή.
    }

    /**
     *  Overloaded Constructor.
     * @param id
     * @param firstname
     * @param lastname
     */
    public Student(int id, String firstname, String lastname) { // πιο ευέλικτος overloaded constructor.
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) { //setter.
        this.id = id; // για να ξεχωρίζω την παράμετρο με το πεδίο της κλάσης. είναι δηλαδή το id της κλάσης με το this, αλλιώς είναι το id παράμετρος.
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
