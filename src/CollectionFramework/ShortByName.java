package CollectionFramework;

import java.util.Comparator;

public class ShortByName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		if (o1.getFirstName().compareTo(o2.getFirstName())==0) {
			return o1.getLastName().compareTo(o2.getLastName());
		} else {
return o1.getFirstName().compareTo(o2.getFirstName());
		}
	
	}

}
