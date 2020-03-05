package ua.lviv.iot.thirdLab.filmMaking.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.thirdLab.filmMaking.model.SortType;

class FilmMakingManagerUtilsTest extends BaseFilmMakingManagerTest {

	@Test
	void testSortEmptyList() {
		FilmMakingManagerUtils.sortCostumesByProductionYear(null, SortType.DESC);
		if (costumes == null) {
			System.out.println("Please, add cameras and try again.");
		}
	}

	@Test
	void testSortingByProductionYearAscending() {
		FilmMakingManagerUtils.sortCostumesByProductionYear(costumes, SortType.ASC);
		assertEquals(2004, costumes.get(0).getProductionYear());
		assertEquals(2010, costumes.get(1).getProductionYear());
		assertEquals(2016, costumes.get(2).getProductionYear());
	}

	@Test
	void testSortingByProductionYearDescending() {
		FilmMakingManagerUtils.sortCostumesByProductionYear(costumes, SortType.DESC);
		assertEquals(2016, costumes.get(0).getProductionYear());
		assertEquals(2010, costumes.get(1).getProductionYear());
		assertEquals(2004, costumes.get(2).getProductionYear());
	}

	@Test
	void testSortingByYearOfUseAscending() {
		FilmMakingManagerUtils.sortCostumesByYearOfUse(costumes, SortType.ASC);
		assertEquals(1914, costumes.get(0).getYearOfUse());
		assertEquals(1992, costumes.get(1).getYearOfUse());
		assertEquals(1995, costumes.get(2).getYearOfUse());
	}

	@Test
	void testSortingByYearOfUseDescending() {
		FilmMakingManagerUtils.sortCostumesByYearOfUse(costumes, SortType.DESC);
		assertEquals(1995, costumes.get(0).getYearOfUse());
		assertEquals(1992, costumes.get(1).getYearOfUse());
		assertEquals(1914, costumes.get(2).getYearOfUse());
	}
}
