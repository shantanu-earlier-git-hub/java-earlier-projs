package adv_java_course.votingsystem;

import java.util.LinkedHashMap;

public class VotingSystem {

    private LinkedHashMap<String, Integer> votingHashMap = new LinkedHashMap<>(10,
            0.75f, true);


    public void vote(String contestant) {
        this.votingHashMap.merge(contestant, 1, Integer::sum);

    }


    public LinkedHashMap<String, Integer> getVotes() {
        return this.votingHashMap;
    }


}
