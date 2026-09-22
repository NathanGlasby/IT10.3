package scores;

public class Scores {
    public static void main(String[] args) {
        int[] saScores = {16, 33, 29};
        int[] nzScores = {33, 26, 24};

        System.out.println("South Africa vs New Zealand");

        int gameCounter = 1;
        for (int i = 0; i < saScores.length; i++) {
            String winner;

            if (saScores[i] > nzScores[i]) {
                winner = "South Africa wins";
            } else {
                winner = "New Zealand wins";
            }

            System.out.println("Game " + gameCounter + ": "
                    + saScores[i] + " - " + nzScores[i] + " " + winner);

            gameCounter++;
        }

        int saTotal = 0;
        for (int i = 0; i < saScores.length; i++) {
            saTotal = saTotal + saScores[i];
        }

        System.out.println("");
        System.out.println("Totals:");
        System.out.println("SA: " + saTotal);

        int nzTotal = 0;
        for (int i = 0; i < nzScores.length; i++) {
            nzTotal = nzTotal + nzScores[i];
        }

        System.out.println("NZ: " + nzTotal);
    }
}