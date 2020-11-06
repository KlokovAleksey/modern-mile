public class BonusMilesService {
    public int calculate(int cost) {
        int mile = 1;
        int each = 20;
        int sum = cost * mile / each;
        return sum;
    }
}

