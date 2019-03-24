package com.upc.web.dao;

import aa.Event;
import com.upc.web.entity.News;
import com.upc.web.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;
import java.util.List;

public class UDao {
    public static void main(String[] args) {
        SessionFactory sessionFactory;
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder ()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        sessionFactory = new MetadataSources ( registry ).buildMetadata().buildSessionFactory();
        // create a couple of events...
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        User user1=new User();
        User user2=new User ();
        User user3=new User ();
        News news1 =new News ();
        News news2 =new News ();
        News news3 =new News ();




        //session.save( new Event( "Our very first event!", new Date () ) );
        //session.save( new Event( "A follow up event", new Date() ) );
        session.getTransaction().commit();
        session.close();

        // now lets pull events from the database and list them
       /* session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery( "from Event" ).list();
        for ( Event event : (List<Event>) result ) {
            System.out.println( "Event (" + event.getDate() + ") : " + event.getTitle() );
        }
        session.getTransaction().commit();
        session.close();*/
    }
}
