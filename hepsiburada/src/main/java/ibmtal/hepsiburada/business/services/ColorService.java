package ibmtal.hepsiburada.business.services;

import java.util.ArrayList;

import ibmtal.hepsiburada.core.result.Result;
import ibmtal.hepsiburada.entities.Color;

public interface ColorService {
	Color add(Color color);
	ArrayList<Color> getAll();
	Result<Color> getColors();
}
