public class ClassComparison1_0 {
    public static void main(String[] args) {
        // Marks of 5 students in 4 subjects from Class A
        int[][] classA = {
            {78, 85, 90, 92},
            {88, 76, 80, 85},
            {90, 93, 89, 91},
            {70, 65, 75, 80},
            {85, 87, 88, 86}
        };

        // Marks of 5 students in 4 subjects from Class B
        int[][] classB = {
            {82, 79, 85, 90},
            {75, 80, 78, 74},
            {88, 86, 84, 89},
            {90, 91, 92, 90},
            {76, 80, 79, 81}
        };

        double avgA = calculateAverage(classA);
        double avgB = calculateAverage(classB);

        System.out.println("Average marks of Class A: " + avgA);
        System.out.println("Average marks of Class B: " + avgB);

        if (avgA > avgB) {
            System.out.println("Class A performed better.");
        } else if (avgB > avgA) {
            System.out.println("Class B performed better.");
        } else {
            System.out.println("Both classes performed equally well.");
        }
    }

    public static double calculateAverage(int[][] marks) {
        int total = 0;
        int count = 0;
        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }
        return (double) total / count;
    }
}
