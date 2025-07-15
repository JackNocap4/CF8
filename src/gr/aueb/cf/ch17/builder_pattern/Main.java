package gr.aueb.cf.ch17.builder_pattern;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book.Builder(1, "d650a87")
                .author("Jimmy")
                .title("Coach")
                .build();

        System.out.println(book1.getIsbn());
    }


}
