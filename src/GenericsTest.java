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

        for (Triple<String, Integer, Integer> triple : arrayTeams) {
            // grab info from triple and place into pair
                // grab team name
                // grab wins and loss integers then place into winPercentage
                    // place
        }

     }
}
