package Marathon.runner;

import Marathon.runner.impl.Competitor;

public class Team {
    private String name;
    private Competitor[] competitors;

    public Team(String name, Competitor... competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public String getName() {
        return name;
    }

    public void showResults() {
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
