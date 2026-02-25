package ibmtal.n11.business.services;

import ibmtal.n11.core.result.Result;
import ibmtal.n11.entities.Gender;

public interface GenderService {
	Result<Gender> getAll();
}
