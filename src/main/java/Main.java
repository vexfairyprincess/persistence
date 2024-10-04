import dao.StudentDAO;
import models.Student;

public class Main {
    public static void main(String[] args) {
        StudentDAO daoStudent = new StudentDAO();
        Student karen = new Student();
        karen.setName("Karen Fonseca");
        karen.setId(123L);
        karen.setMajor("Ingenieria en sistemas");
        //daoStudent.save(karen);

        Student cesar = new Student();
        cesar.setName("Cesar Silva");
        cesar.setId(456L);
        cesar.setMajor("Ingenieria en sistemas");
        daoStudent.save(cesar);

    }
}
