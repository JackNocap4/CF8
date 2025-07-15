package gr.aueb.cf.ch12;

public class CustomerMain {

    public static void main(String[] args) {



    Customer customer = new Customer(1, "Jimmy", "Bald", "123398712", "2421047534", "Central Macedonia", "Τhessalonikis", "Salonica", "S. Davaki", "12", "38333" );

        System.out.println("Id: " + customer.getId());
        System.out.println("Firstname: " + customer.getFirstname());
        System.out.println("Lastname: " + customer.getLastname());
        System.out.println("Afm: " + customer.getAfm());
        System.out.println("PhoneNo: " + customer.getPhoneNo());
        System.out.println("Region: " + customer.getRegion());
        System.out.println("Prefecture: " + customer.getPrefecture());
        System.out.println("City: " + customer.getCity());
        System.out.println("getStreet: " + customer.getStreet());
        System.out.println("StreetNo: " + customer.getStreetNo());
        System.out.println("ZipCode: " + customer.getZipCode());
    }
}
