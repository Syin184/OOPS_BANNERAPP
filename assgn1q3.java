// Creating Class with name PenDistribution indicating the purpose 
// is to divide pens equally among students.
class PenDistribution {

    public static void main(String[] args) {

        // Create int variable totalPens and assign value 14
        int totalPens = 14;

        // Create int variable totalStudents and assign value 3
        int totalStudents = 3;

        // Calculate pens each student gets (Quotient)
        int pensPerStudent = totalPens / totalStudents;

        // Calculate remaining pens (Remainder)
        int remainingPens = totalPens % totalStudents;

        // Display the result
        System.out.println("Each student will get " 
                + pensPerStudent + " pens.");
        System.out.println("Remaining non-distributed pens: " 
                + remainingPens);
    }
}