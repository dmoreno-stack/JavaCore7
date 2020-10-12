package homework_for_lesson13;

import java.util.Arrays;

public class Pizza {
    private String name;
    private Size size [];
    private Type type;

    public Pizza(String name, Size[] size, Type type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size[] getSize() {
        return size;
    }

    public void setSize(Size[] size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "We offer a classical Pizza -" + " "+ name + "," + "all sizes-" + Arrays.toString(size) +
                ",type-" + type + ".";
    }
}
