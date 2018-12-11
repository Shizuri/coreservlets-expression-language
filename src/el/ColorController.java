package el;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ColorController {

	private String[] colorArray = {"red", "blue", "orange", "yello"};
	private List<String> colorList = Arrays.asList("green", "white", "teal", "purple", "violet", "pink");
	private Map<String, String> peopleMap;
	private List<Integer> numbers = Arrays.asList(-3,-2,-1,0,1,2,3);
	
	public ColorController() {
		peopleMap = new HashMap<>();
		peopleMap.put("123", "Pero Perovski");
		peopleMap.put("234", "Mitko Mitkovski");
		peopleMap.put("345", "Vasko Vaskovski");
	}
	
	public String[] getColorArray() {
		return colorArray;
	}

	public List<String> getColorList() {
		return colorList;
	}

	public Map<String, String> getPeopleMap() {
		return peopleMap;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

}
