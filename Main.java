package phoneNumbers;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Alexa", new ArrayList<String>());
        phoneNumbers.put("Marc", new ArrayList<String>());
        phoneNumbers.get("Alexa").add("+21254754321");
        phoneNumbers.get("Alexa").add("+3325414523");
        phoneNumbers.get("Marc").add("+4454214568");
        phoneNumbers.get("Marc").add("+4458452123");

        for (String person: phoneNumbers.keySet()) {
            System.out.println(phoneNumbers.get(person));
        }
    }
}


