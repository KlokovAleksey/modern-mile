public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonus = service.calculate(3000);

        //  int mile = 1;
        //  int cost = 3000;
        //  int each = 20;
        //  int sum = cost * mile / each;
        //  System.out.println(sum);
        System.out.println(bonus);
    }
}