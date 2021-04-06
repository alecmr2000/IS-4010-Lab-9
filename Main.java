import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
    static ArrayList<Person> people;
    static String filename;
    static FileReader myFile;
    // Above is decalring variables.

    public static void main(String[] args) {
        people = new ArrayList<Person>();

        filename = "data.txt";

        String name = "";
        String age = "";
        String color = "";

        people.add(new Person("Alec", 20, "red/black"));
        people.add(new Person("A", 87, "pink"));
        people.add(new Person("B", 13, "yellow"));
        people.add(new Person("C", 55, "black"));
        people.add(new Person("D", 4, "green"));

        try {
            FileWriter toWriteFile;
            toWriteFile = new FileWriter("data.txt");

            BufferedWriter output = new BufferedWriter(toWriteFile);

            for (int i = 0; i < people.size(); i++){
                output.write(people.get(i).getName());
                output.newLine();
                output.write(Integer.toString(people.get(i).getAge()));
                output.newLine();
                output.write(people.get(i).getColor());
                output.newLine();

                output.flush();
            }
            output.close();
        } catch (IOException excpt) {
            excpt.printStackTrace();
        }

        try {
            FileReader toReadFile;
            toReadFile = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(toReadFile);

            while (reader.ready()) {
                name = reader.readLine();
                age = reader.readLine();
                color = reader.readLine();

                System.out.printf("%-10s %-10s %-10s", name, age, color);
            }
            reader.close();
        } catch (IOException excpt) {
            excpt.printStackTrace();
        }

    }
}