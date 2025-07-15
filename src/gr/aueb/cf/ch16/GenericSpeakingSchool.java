package gr.aueb.cf.ch16;

public class GenericSpeakingSchool {
    private final Ispeakable speakable;

    // Dependency Injection -- IoC (Inversion of Control)
    public GenericSpeakingSchool(Ispeakable speakable) {
        this.speakable = speakable;
    }

    public void learnToSpeak() {
        speakable.speak();
    }
}
