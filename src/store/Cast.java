package store;

import java.util.List;

public class Cast extends Movies{
    private String actorName;
    private String actorSurname;
    private String role;

    public Cast(String movieName, String category, String genre, int year, String description, Director director, List<Cast> cast, String actorName, String actorSurname, String role) {
        super(movieName, category, genre, year, description, director, cast);
        this.actorName = actorName;
        this.actorSurname = actorSurname;
        this.role = role;
    }

    public Cast(String actorName, String actorSurname, String role) {
        this.actorName = actorName;
        this.actorSurname = actorSurname;
        this.role = role;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorSurname() {
        return actorSurname;
    }

    public void setActorSurname(String actorSurname) {
        this.actorSurname = actorSurname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "Actor   : " + actorName + " " + actorSurname +
                "\nRole    : " + role + "\n";
    }
}
