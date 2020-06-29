package Exception;

public class AgeUtils {
    public static void checkAge(int age) throws AgeOld, AgeYoung {
        if (age < 18) {
            throw new AgeOld("Age " + age + " too young");
        }
        System.out.println("Age " + age + " OK!");
    }
}
