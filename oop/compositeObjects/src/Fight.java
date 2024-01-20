import java.util.Random;

public class Fight {
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean  approved;

    public Fight() {
        this.setChallenged(null);
        this.setChallenger(null);
        this.setRounds(0);
        this.setApproved(false);
    }

    public Fighter getChallenged() {
        return challenged;
    }
    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }
    public Fighter getChallenger() {
        return challenger;
    }
    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isApproved() {
        return approved;
    }
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void scheduleFight(Fighter challenged, Fighter challenger, int newRounds) {
        if (newRounds > 0 && challenged.getCategory().equals(challenger.getCategory()) && challenged != challenger){
            this.setChallenged(challenged);
            this.setChallenger(challenger);
            this.setRounds(newRounds);
            this.setApproved(true);
        } else this.setApproved(false);
    }

    public void theFight() {
        if (this.isApproved()) {
            System.out.println("### Challenged ###");
            challenged.show();
            System.out.println("### Challenger ###");
            challenger.show();
            Random random = new Random();
            String roundWinner;
            int win0 = 0;
            int win1 = 0;
            int winCondition = (int) (this.getRounds() % 2 == 0 ? this.getRounds() / 2 + 1 : Math.ceilDiv(this.getRounds(), 2));

            int challengedMastery = (challenged.getWins() - challenged.getLosses()) + Math.round(challenged.getHeight() * 10) + Math.round(challenged.getWeight() * 2 / 10);
            int challengerMastery = (challenger.getWins() - challenger.getLosses()) + Math.round(challenger.getHeight() * 10) + Math.round(challenger.getWeight() * 2 / 10);
            System.out.println(challenged.getName() + ": " + challengedMastery);
            System.out.println(challenger.getName() + ": " + challengerMastery);
            
            for (int i = 1; i <= rounds && win0 != winCondition && win1 != winCondition; i++) {
                if (random.nextInt(challengedMastery + challengerMastery) < challengedMastery) {
                    roundWinner = challenged.getName();
                    ++win1;
                } else {
                    roundWinner = challenger.getName();
                    ++win0;
                }
                System.out.println(
                    "- - - - - - - - - - - - -" + "\n" +
                    "Round " + i + "(Winner): " + roundWinner       
                );
            }
            if (win0 > win1) {
                System.out.println(
                    "- - - - - - - - - - - - -\n" + 
                    challenger.getName() + " Winner\n"
                );
                challenger.winCombat();
                challenged.loseCombat();
            } else if (win1 > win0 ){
                System.out.println(
                    "- - - - - - - - - - - - -\n" + 
                    challenged.getName() + " Winner\n"
                );
                challenged.winCombat();
                challenger.loseCombat();
            } else {
                System.out.println("- - - - - - - - - - - - -\nDraw\n");
                challenged.drawCombat();
                challenger.drawCombat();
            }
        } else System.out.println("Fight isn't schedule");
    }
}
