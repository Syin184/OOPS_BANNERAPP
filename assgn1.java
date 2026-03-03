// Creating Class with name FindAge indicating the purpose is to find age
// Notice the class name is a Noun.
class FindAge {

    public static void main(String[] args) {

        // Create a String variable name and assign value Harry
        String name = "Harry";

        // Create an int variable birthYear and assign value 2000
        int birthYear = 2000;

        // Create an int variable currentYear and assign value 2024
        int currentYear = 2024;

        // Calculate age
        int age = currentYear - birthYear;

        // Display the result
        System.out.println("Displaying Age:\n" 
                + name + " is " + age + " years old.");
    }
}