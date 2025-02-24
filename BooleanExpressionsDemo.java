public class BooleanExpressionsDemo {
    public static void main(String[] args) {
        // Define boolean variables
        boolean isJavaFun = true;
        boolean isHomeworkTiring = false;
        
        // Define integer variables
        int a = 15;
        int b = 20;
        
        // Boolean expressions
        boolean isAGreater = a > b;           // Checks if a is greater than b
        boolean areEqual = a == b;            // Checks if a is equal to b
        boolean bothTrue = isJavaFun && (a < b);  // AND condition
        boolean eitherTrue = isJavaFun || isHomeworkTiring;  // OR condition
        boolean notTrue = !isHomeworkTiring;  // NOT condition
        boolean exclusiveOr = isJavaFun ^ isHomeworkTiring;  // XOR condition
        
        // Print out the results
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is homework tiring? " + isHomeworkTiring);
        System.out.println("Is 'a' greater than 'b'? " + isAGreater);
        System.out.println("Are 'a' and 'b' equal? " + areEqual);
        System.out.println("Both conditions (isJavaFun && a < b): " + bothTrue);
        System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherTrue);
        System.out.println("Logical NOT of isHomeworkTiring: " + notTrue);
        System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);
    }
}
