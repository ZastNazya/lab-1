package ua.lviv.iot;

import ua.lviv.iot.tools.Tool;

import java.util.List;

public interface ToolWriter {
    void writeToFile(List<Tool> tool);
}
