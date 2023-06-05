// Nama file: DAOManager.java
// Penulis  : Zidan Rafindra Utomo
// NIM      : 24060121130051
// Deskripsi: Kelas DAOManager untuk mengatur DAO Person dan MySQLPersonDAO

public class DAOManager {
    private PersonDAO personDAO;

    public DAOManager(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public DAOManager() {
    }

    public void savePerson(Person p) throws Exception {
        personDAO.savePerson(p);
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
