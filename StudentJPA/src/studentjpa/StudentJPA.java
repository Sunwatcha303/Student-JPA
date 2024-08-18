/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentjpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sun watcha
 */
public class StudentJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student1 = new Student("64050816", "Watcharakorn Maleewan", 4.00);
        Student student2 = new Student("65050816", "Maleewan Watcharakorn", 4.00);

        StudentTable.insertStudent(student1);
        StudentTable.insertStudent(student2);

        List<Student> studentList = StudentTable.findAll();
        System.out.println(studentList);

        Student studentTmp = StudentTable.findStudentById("65050816");
        System.out.println(studentTmp);

        studentList = StudentTable.findStudentByName("Watcharakorn Maleewan");
        System.out.println(studentList);

        StudentTable.deleteStudent(student1);
        StudentTable.deleteStudent(student2);
        
        studentList = StudentTable.findAll();
        System.out.println(studentList);
    }

}
