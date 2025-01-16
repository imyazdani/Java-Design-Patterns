package org.example.structural.decorator;

/*
    Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects
    inside special wrapper objects that contain the behaviors.
    Decorator vs Proxy:
    Decorator has a different purpose. A decorator adds one or more responsibilities to an object,
    whereas a proxy controls access to an object.
 */
public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSourceDecorator encoded =
                new CompressionDecorator(
                        new EncryptionDecorator(
                                new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
