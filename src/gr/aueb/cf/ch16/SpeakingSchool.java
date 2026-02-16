package gr.aueb.cf.ch16;

public class SpeakingSchool {

    private final Cat cat = new Cat();   //dependency. αυτη η κλάση για να δουλεψει χρειαζεται cat. είναι instance της
                                        // κλασης cat. Η αναφορα,δλδ to reference είναι immutable και όχι τα χαρ/κα της γάτας.


    public SpeakingSchool() {

    }

    public void learnToSpeak() {
        cat.speak();
    }
}
