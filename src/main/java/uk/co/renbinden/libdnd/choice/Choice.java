package uk.co.renbinden.libdnd.choice;

import java.util.List;

public class Choice<T> {

    private final List<T> options;

    public Choice(List<T> options) {
        this.options = options;
    }

    public List<T> getOptions() {
        return options;
    }
}
