package fr.hetic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.*;

public class Exercice9 {

    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            DataReader dataReader = (DataReader) context.getBean("dataReader");

            dataReader.process();
        } catch (Exception ex) {
            System.out.println("An error occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
