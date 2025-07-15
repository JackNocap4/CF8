package gr.aueb.cf.ch15.quiz5;

public class Child5 extends Parent5 {

    public Child5() {
        super(100);  // π.χ. περνάμε το 100 στο constructor του Parent5 gia na min exei lathos.
        System.out.println("Child Constructor");
    }
}

// δεν έδωσα default constructor ston parent και έτσι δεν καλείται αυτόματα η default οπότε πρέπει να βάλω super.