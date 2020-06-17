/**
 * oneTwoMany
 */
public class oneTwoMany {

    public String solution(int n) {
        if (n == 1) {
            return "one";
        } else if (n == 2) {
            return "two";
        } else {
            return "many";
        }
    }

    public static void main(String[] args) {
        oneTwoMany otm = new oneTwoMany();
        System.out.println(otm.solution(10));
    }

}
