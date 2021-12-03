package model;

public enum Team {
    HOME,
    GUEST;

    public String toString() {
        if (this == GUEST)
            return "Home";
        else
            return "Guest";
    }

}