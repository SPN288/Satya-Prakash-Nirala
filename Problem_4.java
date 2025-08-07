import java.util.HashMap;

public class Problem_4 {
    public static void main(String[] args) {
        int[] num = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            hm.put(i, 0);
        }

        for (int n : num) {
            for (int i = 1; i <= 9; i++) {
                if (n % i == 0) {
                    hm.put(i, hm.get(i) + 1);
                }
            }
        }

        System.out.println(hm);
    }
}
