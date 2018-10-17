package ru.oav.test.chatbot2;

import org.hibernate.Session;

/**
 * Created by antonorlov on 17/10/2018.
 */
public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        User user = new User();
        user.setName("Мафусаил");

        session.save(user);
        session.getTransaction().commit();
    }
}
