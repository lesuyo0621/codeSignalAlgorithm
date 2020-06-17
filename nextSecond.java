import java.util.Arrays;

public class nextSecond {
    public int[] solution(int[] currentTime) {
        currentTime[2]++;
        if (currentTime[2] == 60) {
            currentTime[1]++;
            currentTime[2] = 0;
        }

        if (currentTime[1] == 60) {
            currentTime[0]++;
            currentTime[1] = 0;
        }

        if (currentTime[0] == 24) {
            currentTime[0] = 0;
        }

        return currentTime;
    }

    public static void main(String[] args) {
        nextSecond ns = new nextSecond();
        int[] currentTime = { 22, 59, 59 };

        System.out.println(Arrays.toString(ns.solution(currentTime)));
    }
}