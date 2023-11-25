package by.iba.lab7pb.service;

import by.iba.lab7pb.dao.PersonDao;
import by.iba.lab7pb.dao.PlaneDao;
import by.iba.lab7pb.dao.TicketDao;
import by.iba.lab7pb.dao.UserDao;
import by.iba.lab7pb.model.Person;
import by.iba.lab7pb.model.Plane;
import by.iba.lab7pb.model.Ticket;
import by.iba.lab7pb.model.User;

import java.util.List;

public class DaoImpl implements Dao{
    private UserDao userDao;
    private PersonDao personDao;
    private PlaneDao planeDao;
    private TicketDao ticketDao;
    @Override
    public List<Person> getPersons() {
        personDao = new PersonDao();
        return personDao.getPersons();
    }

    @Override
    public void insertPerson(Person person) {
        personDao = new PersonDao();
        personDao.insertPerson(person);
    }

    @Override
    public int getLastUser() {
        userDao = new UserDao();
        return userDao.getLastUser();
    }

    @Override
    public Person getPerson(int id) {
        personDao = new PersonDao();
        return personDao.getPerson(id);
    }

    @Override
    public void updatePlanesTickets(int id, boolean plus) {
        planeDao = new PlaneDao();
        planeDao.updatePlanesTickets(id,plus);
    }

    @Override
    public List<Plane> getPlanes() {
        planeDao = new PlaneDao();
        return planeDao.getPlanes();
    }

    @Override
    public Plane getPlane(int id) {
        planeDao = new PlaneDao();
        return planeDao.getPlane(id);
    }

    @Override
    public List<Ticket> getTickets() {
        ticketDao = new TicketDao();
        return ticketDao.getTickets();
    }

    @Override
    public boolean insertTicket(int idPlane, int idPerson) {
        ticketDao = new TicketDao();
        return ticketDao.insertTicket(idPlane,idPerson);
    }

    @Override
    public void deleteBook(int id) {
        ticketDao =new TicketDao();
        planeDao = new PlaneDao();
        planeDao.updatePlanesTickets(ticketDao.getTicket(id).getIdPlane(), false);
        ticketDao.deleteBook(id);
    }

    @Override
    public User isValidUser(String login, byte[] password) {
        userDao = new UserDao();
        return userDao.isValidUser(login, password);
    }

    @Override
    public boolean insertUser(User user) {
        userDao = new UserDao();
        return userDao.insertUser(user);
    }

    @Override
    public void insertPlane(Plane plane) {
        planeDao = new PlaneDao();
        planeDao.insertPlane(plane);
    }

    @Override
    public int getPersonByUser(int id) {
        personDao = new PersonDao();
        return personDao.getPersonByUser(id);
    }
}
