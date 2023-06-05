package Voting_system;
import java.util.Random;

public class MainVotingSystem {
    public static void main(String[] args) {
        Random n = new Random();
        int votes = n.nextInt(1000);
        Candidacies candidates = new Candidacies();

        candidates.addCandidate(1, "Abelinha 123");
        candidates.addCandidate(2, "Urso louco");
        candidates.addCandidate(3, "Guaxinin");

        System.out.println(votes);

        for(int i = 0; i < votes; i++) {
            candidates.getCandidate(0).vote();
        }

        votes = n.nextInt(1000);
        System.out.println(votes);

        for(int i = 0; i < votes; i++) {
            candidates.getCandidate(1).vote();
        }

        votes = n.nextInt(1000);
        System.out.println(votes);

        for(int i = 0; i < votes; i++) {
            candidates.getCandidate(2).vote();
        }

        for (int i = 0; i < candidates.getQuantity(); i++) {
            System.out.println(candidates.getCandidate(i).toString());
        }
        System.out.println(candidates.getWinner());
    }
}
