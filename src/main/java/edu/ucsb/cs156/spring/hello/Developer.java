package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // TODO: Change this to your name
        // You may use just the name that is used on <https://bit.ly/cs156-f26-teams>
        // i.e. your first name, or your first and initial of last name - DONE

        return "Deserae M";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Change this to your github id - DONE
        return "DeseraeM";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        // TODO: Change this to your team name - DONE
        Team team = new Team("f26-06");
        team.addMember("Deserae M");
        team.addMember("Anna G");
        team.addMember("Kathleen C.");
        team.addMember("Issac G");
        team.addMember("Nir N");
        team.addMember("John Yang");
        return team;
    }
}
