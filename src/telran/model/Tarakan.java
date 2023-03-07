package telran.model;


import java.util.Objects;
import java.util.Random;

public class Tarakan {
   int id;
   int steps;

    public Tarakan(int id) {
        this.id = id;
        this.steps = 0;
    }

    public int getId() {
        return id;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarakan tarakan = (Tarakan) o;
        return id == tarakan.id && steps == tarakan.steps;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, steps);
    }

    @Override
    public String toString() {
        return "Tarakan{" +
                "id=" + id +
                ", steps=" + steps +
                '}';
    }
}
