package example.util;


import org.hibernate.SessionFactory;

import javax.mail.Session;
import javax.security.auth.login.Configuration;

public class HibernateUtil {
    private static final SessionFactory ourSessionFatory;
static{
try{
    Configuration configuration = new Configuration();
    configuration.configure();
    ourSessionFatory = configuration.buildSessionFactory();
}catch (Throwable ex){
throw new ExceptionInInitializerError(ex);
}
}
}
