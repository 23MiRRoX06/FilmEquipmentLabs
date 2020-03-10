package ua.lviv.iot.equipment.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.equipment.model.AbstarctShootingEquipment;

public class FilmMakingWriter {

  private Writer csvWriter;

  public void writeToFile(List<AbstarctShootingEquipment> equipment) throws IOException {
    for (AbstarctShootingEquipment item : equipment) {
      csvWriter.write(item.getHeaders());
      csvWriter.write("\n");
      csvWriter.write(item.toCSV());
      csvWriter.write("\n");
      csvWriter.flush();
    }
  }

  public void setCsvWriter(Writer csvWriter) {
    this.csvWriter = csvWriter;
  }
}
