package ua.lviv.iot;

import ua.lviv.iot.tools.Tool;
import ua.lviv.iot.tools.TwoHandedSaw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IToolWriter implements ToolWriter {
    @Override
    public void writeToFile(List<Tool> tools) {
        try {
            File file = new File("result.csv");
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            for (Tool tool: tools) {
                writer.write(tool.getHeader());
                writer.write(tool.toCSV());
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
