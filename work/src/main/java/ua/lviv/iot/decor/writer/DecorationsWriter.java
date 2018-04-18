package ua.lviv.iot.decor.writer;

import ua.lviv.iot.decor.decorations.Decoration;

import java.io.*;
import java.util.List;

public class DecorationsWriter {

    public final void writeToFile(final List<Decoration>decorationList) throws IOException {
        File file = new File("E:\\IdeaProjects\\decoration.csv");
        if (!file.exists()) {
            file.createNewFile();
        }

        try (OutputStream stream = new FileOutputStream(file);
             PrintWriter writer = new PrintWriter(stream)) {

            for (Decoration decoration : decorationList) {
                writer.println(decoration.getHeaders());
                writer.println(decoration.toCSV());
                writer.println("");
            }
            writer.close();
        } catch (IOException e) {
            throw e;
        }
    }
}
