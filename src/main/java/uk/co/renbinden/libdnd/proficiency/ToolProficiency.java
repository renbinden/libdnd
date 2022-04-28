package uk.co.renbinden.libdnd.proficiency;

import uk.co.renbinden.libdnd.item.tool.ToolType;

public class ToolProficiency<T extends ToolType> implements Proficiency {

    private final T toolType;

    public ToolProficiency(T toolType) {
        this.toolType = toolType;
    }

    public T getToolType() {
        return toolType;
    }

}
