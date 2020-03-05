package ua.lviv.iot.thirdLab.filmMaking.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.thirdLab.filmMaking.model.AbstarctShootingEquipment;
import ua.lviv.iot.thirdLab.filmMaking.model.Camera;
import ua.lviv.iot.thirdLab.filmMaking.model.Costume;

public abstract class BaseFilmMakingManagerTest {

	protected List<Costume> costumes;
	protected List<AbstarctShootingEquipment> cameras;

	@BeforeEach
	public void createCostumes() {
		costumes = new LinkedList<Costume>();
		costumes.add(new Costume(2004, 1914, "Drama"));
		costumes.add(new Costume(2010, 1992, "Western"));
		costumes.add(new Costume(2016, 1995, "Historical"));
	}

	@BeforeEach
	public void createCameras() {
		cameras = new LinkedList<AbstarctShootingEquipment>();
		cameras.add(new Camera(2002, 12));
		cameras.add(new Camera(2016, 6));
		cameras.add(new Camera(2016, 1));
	}
}