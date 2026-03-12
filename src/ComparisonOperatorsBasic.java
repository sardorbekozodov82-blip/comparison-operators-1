public class ComparisonOperatorsBasic {
    public static void main(String[] args) {
        int a = 15, b = 20;
        System.out.println("=== Comparison Operators: a=" + a + ", b=" + b + " ===");
        System.out.println("a == b  : " + (a == b));
        System.out.println("a != b  : " + (a != b));
        System.out.println("a >  b  : " + (a >  b));
        System.out.println("a <  b  : " + (a <  b));
        System.out.println("a >= b  : " + (a >= b));
        System.out.println("a <= b  : " + (a <= b));

        // String comparison — IMPORTANT: use .equals(), not ==
        System.out.println("\n=== String Comparison ===");
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println("s1 == s2          : " + (s1 == s2));
        System.out.println("s1 == s3          : " + (s1 == s3) + " (different object!)");
        System.out.println("s1.equals(s3)     : " + s1.equals(s3) + " (correct way)");
        System.out.println("s1.equalsIgnoreCase("JAVA"): " + s1.equalsIgnoreCase("JAVA"));

        // Practical: classify score
        System.out.println("\n=== Score Classifier ===");
        int[] scores = {95, 82, 70, 55, 40};
        for (int score : scores) {
            String grade = score >= 90 ? "A" : score >= 80 ? "B" :
                           score >= 70 ? "C" : score >= 60 ? "D" : "F";
            System.out.printf("Score %3d → Grade %s%n", score, grade);
        }
    }
}
