package Voting_system;

public class Candidate {
    private int number;
    private String name;
    private int votes;

    public Candidate (int number, String name){
        this.number = number;
        this.name = name;
        this.votes = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getVotes() {
        return votes;
    }

    public void vote (){
        this.votes++;
    }

    public String toString () {
        return "Candidate: " + name + "\t| Number: " + number + "\t| Votes: " + votes;
    }
}
