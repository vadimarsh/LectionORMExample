import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        LearningGroup group1 = new LearningGroup("ISTbp-18");
        Student student = new Student("Vasiliev","Ivan",group1);

        Student student1 = new Student("Ivanov","Petr",group1);
        group1.getStudents().add(student);
        group1.getStudents().add(student1);

        session.save(group1);

        transaction.commit();
        session.close();

       /* Session session = HibernateUtil.getSession();
        Query qu = session.createQuery("from Student where groupTitle =:parametr");
qu.setParameter("parametr","ISTb-18-1");
        List<Student> students = qu.getResultList();
        for (Student student: students) {
            System.out.println(student);
        }

        session.close();

    }*/
    }
}
