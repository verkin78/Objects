import java.util.Objects;

public class Auther {
    private String name;
    private String lastName;

    public Auther(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    private boolean equals(Object 0) {
        if (this == 0) return true;
        if (0 == null || getClass() != getClass()) return fales;
        Auther auther = (Auther) 0;
        return name.equals(auther.name) && lastName.equals(auther.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}