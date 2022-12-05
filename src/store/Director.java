package store;

import java.util.List;

public class Director{
    private String directorName;
    private String directorSurName;

    public Director(String directorName, String directorSurName) {
        this.directorName = directorName;
        this.directorSurName = directorSurName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getDirectorSurName() {
        return directorSurName;
    }

    public void setDirectorSurName(String directorSurName) {
        this.directorSurName = directorSurName;
    }

    @Override
    public String toString() {
        return "" + directorName + " " + directorSurName;
    }
}
