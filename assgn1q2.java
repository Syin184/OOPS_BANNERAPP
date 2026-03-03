// Creating Class with name AveragePCM indicating the purpose is to 
// calculate average percentage of PCM marks.
class AveragePCM {

    public static void main(String[] args) {

        // Create int variables for marks in each subject
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate total marks
        int total = maths + physics + chemistry;

        // Calculate average percentage
        double average = total / 3.0;

        // Display the result
        System.out.println("Displaying Average Percentage:\n"
                + "Sam's average percent mark in PCM is " 
                + average + "%");
    }
}
