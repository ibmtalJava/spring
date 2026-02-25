package ibmtal.hepsiburada.business.services;

import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.entities.Town;

public interface TownService {
	Result<Town> getAll();
}
