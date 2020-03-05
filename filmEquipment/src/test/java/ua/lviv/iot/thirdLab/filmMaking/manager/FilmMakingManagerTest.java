package ua.lviv.iot.thirdLab.filmMaking.manager;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.thirdLab.filmMaking.model.AbstarctShootingEquipment;
import ua.lviv.iot.thirdLab.filmMaking.model.Costume;

class FilmMakingManagerTest extends BaseFilmMakingManagerTest {

	private FilmMakingManager filmMakingManager;

	@BeforeEach
	public void setUp() {
		filmMakingManager = new FilmMakingManager();
		filmMakingManager.createEquipment(cameras);
		filmMakingManager.createCostumes(costumes);
	}
 
	@Test
	public void testFindEquipmentWithWarrantyPeriodGreaterThan() {
		List<AbstarctShootingEquipment> gear = filmMakingManager.findEquipmentWithWarrantyPeriodGreaterThan(3);
		assertTrue(gear.size() >= 2);
	}

	@Test
	public void testFindCostumesForHistoricalFilm() {
		List<Costume> costumes = filmMakingManager.findCostumesForHistoricalFilm("Historical", 1991);
		assertTrue(costumes.size() >= 2);
	}
}
