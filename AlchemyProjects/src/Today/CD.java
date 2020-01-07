package Today;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class CD {

@Override
public String toString() {
	return "CD==>cdId= " + cdId + ", cdName=" + cdName + ", genre=" + genre + ", price=" + price + "Rs";
}

private int cdId;
private String cdName;
private String genre;
private double price;

public void getCdId(CD cd)
{
	if(cd instanceof InternationalCd)
	{
		InternationalCd icd = (InternationalCd)cd;
		System.out.println(icd);
	}
}
}
	

