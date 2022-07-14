package TDD_Assignmen_Special_Character;

import java.util.StringTokenizer;

public class SpecialCharacter {

    public String removeSpecialChar(String str) 
    {
	 String Data = "";
	 str = str.replaceAll("[^a-zA-Z ]","");
		
	 StringTokenizer st = new StringTokenizer(str);
	 while(st.hasMoreTokens()) {
		 Data = Data+st.nextToken()+" ";
		
	}
	return Data.trim();	
  }
}

