public class BonusMilesService {
    public int calculate(int cost) {
        int miles = 20;
        int bonusMiles = cost / miles;

        return bonusMiles;
    }
}
