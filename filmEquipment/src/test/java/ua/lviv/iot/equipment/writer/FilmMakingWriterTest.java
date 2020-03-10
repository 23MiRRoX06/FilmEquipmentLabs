package ua.lviv.iot.equipment.writer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.equipment.model.AbstarctShootingEquipment;
import ua.lviv.iot.equipment.model.Camera;
import ua.lviv.iot.equipment.model.Costume;
import ua.lviv.iot.equipment.model.Microphone;
import ua.lviv.iot.equipment.model.Quality;

class FilmMakingWriterTest {

  private List<AbstarctShootingEquipment> equipment;

  @BeforeEach
  public void addEquipment() {
    equipment = new LinkedList<AbstarctShootingEquipment>();
    equipment.add(new Camera(1998, 12, "Canon", "China", "RS-340", "plastic", 216.4, "red", true, 8,
        "mp4", "4K", 120, 100, 55, true));
    equipment.add(new Costume(2007, 10, "CheapCostumes", "Ukraine", "WWII", "cotton", 345.1,
        "black", 1945, "Historical", "M", Quality.HIGH));
    equipment.add(new Microphone(2010, 24, "Blue", "China", "MV-240", "material", 1250, "gray",
        false, 8, "MP3", 20000, 47, true, "On-stand"));
  }

  @Test
  void testProperTextFormatting() {
    try (Writer csvWriter = new StringWriter()) {
      FilmMakingWriter writer = new FilmMakingWriter();
      writer.setCsvWriter(csvWriter);
      writer.writeToFile(equipment);
      assertEquals(
          "productionYear,warrantyWorkPeriodInMonths,factoryManufacturer,countryManufacturer,modelName,material,weightInGrams,color,isWaterproof,batteryLifeInHours,recordFormat,videoResolutionStandart,videoFrapsPerSecond,videoRecordingSpeedInMbps,viewingAngleInDegrees,hasLcdMonitor\n1998,12,Canon,China,RS-340,plastic,216.4,red,true,8,mp4,4K,120,100,55,true\nproductionYear,warrantyWorkPeriodInMonths,factoryManufacturer,countryManufacturer,modelName,material,weightInGrams,color,yearOfUse,category,sizeEur,fabricQuality\n2007,10,CheapCostumes,Ukraine,WWII,cotton,345.1,black,1945,Historical,M,HIGH\nproductionYear,warrantyWorkPeriodInMonths,factoryManufacturer,countryManufacturer,modelName,material,weightInGrams,color,isWaterproof,batteryLifeInHours,recordFormat,frequencyRangeInHz,dynamicRangeInDb,isWindproof,mountType\n2010,24,Blue,China,MV-240,material,1250.0,gray,false,8,MP3,20000,47,true,On-stand\n",
          csvWriter.toString());
    } catch (IOException e) {
      fail("The test failed - try to write to the file");
    }
  }

  @Test
  void testToCheckFileWriting() {
    try (Writer csvWriter = new FileWriter(new File("filmEquipment.csv"))) {
      FilmMakingWriter writer = new FilmMakingWriter();
      writer.setCsvWriter(csvWriter);
      writer.writeToFile(equipment);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}