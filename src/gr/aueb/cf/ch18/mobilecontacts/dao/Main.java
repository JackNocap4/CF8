package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

public class Main {
    private static final IMobileContactDAO dao = new MobileContactDAOImpl();

    MobileContact mobileContact = new MobileContact(1, "Jimmy", "Bald", "1234231");
    MobileContact returnedcontact = dao.insert(mobileContact);
}
