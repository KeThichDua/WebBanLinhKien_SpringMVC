package util;


//import javax.security.auth.login.Configuration;
//import org.hibernate.HibernateException;
//import org.hibernate.SessionFactory;

import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */
public class HibernateUtil {
    public static SessionFactory sessionFactory = null;
    public static Configuration cfg= null;

    static {
        try {
            cfg = new Configuration();
            cfg.configure("/util/hibernate.cfg.xml");
            sessionFactory = cfg.buildSessionFactory();
        } catch (HibernateException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
