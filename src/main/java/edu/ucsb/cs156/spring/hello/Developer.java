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
        return "Deserae M";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "DeseraeM";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f26-06");
        team.addMember("Deserae M.");
        team.addMember("Anna G.");
        team.addMember("Kathleen C.");
        team.addMember("Issac G.");
        team.addMember("Nir N.");
        team.addMember("John Y.");
        return team;
    }
}
