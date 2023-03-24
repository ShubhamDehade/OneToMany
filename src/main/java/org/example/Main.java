package org.example;

import bean.Laptop;
import bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Student.class);
        cfg=cfg.addAnnotatedClass(Laptop.class);

        SessionFactory factory=cfg.buildSessionFactory();
        Session ses= factory.openSession();
        Transaction tx=ses.beginTransaction();
        Laptop l1=new Laptop();
        l1.setlName("lenovio");
        Laptop l2=new Laptop();
        l2.setlName("DELL");
        Laptop l3=new Laptop();
        l3.setlName("ASUS");

        Student s1=new Student();
        s1.setsName("shubham");
        s1.setsMarks(87);
        s1.addLaptop(l1);
        s1.addLaptop(l2);
        s1.addLaptop(l3);

        ses.save(s1);
        ses.save(l1);
        ses.save(l2);
        ses.save(l3);
        tx.commit();



    }
}