package Voting_system;

import java.util.ArrayList;
import java.util.List;

public class Candidacies {
    private List<Candidate> candidates = new ArrayList<>();
    private List<Integer> votes = new ArrayList<>();

    public void addCandidate(int number,String name) {
        Candidate candidate = new Candidate(number, name);
        this.candidates.add(candidate);
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    
    public Candidate getCandidate(int index) {
        return candidates.get(index);
    }

    public int getQuantity() {
        return candidates.size();
    }

    public String getWinner(){
        for (Candidate candidate : candidates) {
            votes.add(candidate.getVotes());
        }
        int winner = 0;
        int index = -1;
        for (int i = 0; i < votes.size(); i++){
            if (votes.get(i) > winner){
                winner = votes.get(i);
                index = i;
            }
        }
        if (index == -1){
            return "No winner";
        }
        return "Winner: " + candidates.get(index).getName();
    }
}
