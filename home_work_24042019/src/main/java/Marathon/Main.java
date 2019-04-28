package Marathon;

import Marathon.barrier.Course;
import Marathon.barrier.Cross;
import Marathon.barrier.abstr.Obstacle;
import Marathon.barrier.Wall;
import Marathon.runner.*;
import Marathon.runner.impl.Competitor;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Obstacle[]{new Cross(80),
                                                new Wall(2),
                                                new Wall(1),
                                                new Cross(120)});

        Team team = new Team("Hugurd",
                            new Competitor[]{new Human("Боб"),
                                            new Human("Роб"),
                                            new Cat("Барсик"),
                                            new Dog("Бобик")});

        course.doIt(team);
        team.showResults();
    }
}