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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Auther auther = (Auther) object;
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