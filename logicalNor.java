public class logicalNor {
    public boolean solution(boolean a, boolean b) {
        return a == false && b == false ? true : false;
    }

    public static void main(String[] args) {
        logicalNor ln = new logicalNor();
        boolean a = true;
        boolean b = false;

        System.out.println(ln.solution(a, b));
    }
}