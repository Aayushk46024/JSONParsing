package JSONParsing;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestJSONParsing {
    public static void main(String[] args) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\AayushKhandelwal\\JSONParsing\\data.json"));
        ObjectMapper mapper = new ObjectMapper();

        Person person = mapper.readValue(jsonData, Person.class);

        System.out.println(person.getEmail());
        System.out.println(person.getAddress().getCountry());
    }
}
