public class GenericsTest {
    public static void main(String[] args) {
        Triple<String, Integer, Integer> tripleOne = new Triple<>("Dodgers", 5, 6);
        Triple<String, Integer, Integer> tripleTwo = new Triple<>("Lakers", 10, 0);
        Triple<String, Integer, Integer> tripleThree = new Triple<>("Kings", 7, 9);
        Triple<String, Integer, Integer> tripleFour = new Triple<>("Padres", 6, 5);
        Triple<String, Integer, Integer> tripleFive = new Triple<>("Bears", 4, 8);

        Triple<String, Integer, Integer>[] arrayTeams = new Triple[5];
        arrayTeams[0] = tripleOne;
        arrayTeams[1] = tripleTwo;
        arrayTeams[2] = tripleThree;
        arrayTeams[3] = tripleFour;
        arrayTeams[4] = tripleFive;

        Pair<String, Double>[] pairTeams = new Pair[5];

        for (int i = 0; i < arrayTeams.length; i++) {
            // grab info from triple and place into pair
                // grab team name
            String name = arrayTeams[i].getFirst();
//            pairTeams[i] = new Pair<>(name, (double) i);
//            System.out.println(name + " : " + pairTeams[i].getFirst());
                // grab wins and loss integers
            int numWins = arrayTeams[i].getSecond();
            int totalGames = numWins + arrayTeams[i].getThird();
            double percentWins = (double) numWins / totalGames;
//            System.out.println(percentWins);
            pairTeams[i] = new Pair<>(name, percentWins);
            System.out.println(pairTeams[i].getFirst() + ": " + pairTeams[i].getSecond());
                    // calculate divide wins by total games
                    // place calculation into winPercentage
        }
        double highestWinPercentage = 0;
        String bestTeam = "";

        for (int i = 0; i < pairTeams.length; i++) {
            double oWinPercent = pairTeams[i].getSecond();
            if (oWinPercent > highestWinPercentage) {
                highestWinPercentage = oWinPercent;
                bestTeam = pairTeams[i].getFirst();
            }
        }
        System.out.println("The team with the highest win percentage is " + bestTeam + " with " + highestWinPercentage + "%");
     }
}
