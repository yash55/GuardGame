/**
 * Created by yash on 2/25/16.
 */
public class GuardGame {
    public int answer(long x) {
        if (x < 10) { return (int)x; }
        String[] arr = String.valueOf(x).split("");
        Integer sum = 0;
        for (String e: arr ) {
            sum += Integer.parseInt(e);
        }
        return answer((long)sum);
    }
}
