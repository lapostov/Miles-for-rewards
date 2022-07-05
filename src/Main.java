public class miles_for_rewards {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 1_000_000_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }

}