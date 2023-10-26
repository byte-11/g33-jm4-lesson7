package streamexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Student student = new Student("Ann",19, "Female");
//
//        FileOutputStream fos = new FileOutputStream("resources/student.txt");
//        ObjectOutputStream ous = new ObjectOutputStream(fos);
//        ous.writeObject(student);

        FileInputStream fis = new FileInputStream("resources/student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student studentClone = (Student) ois.readObject();
        System.out.println(studentClone);
    }


}
