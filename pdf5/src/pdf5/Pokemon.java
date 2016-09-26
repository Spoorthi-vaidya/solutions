package pdf5;

public class Pokemon 
{
	private int iPokeId;
	private int iInitialCp;
	private String sName;
	private String sPokemonType;
	private int iTotalMatchPlayed;
	private int iWon;
	private int iLost;
	private float fFinalCP;


public Pokemon(int iPokeId, int iInitialCp, String sName, String sPokemonType,
		int iTotalMatchPlayed, int iWon, int iLost) {
	
	this.iPokeId = iPokeId;
	this.iInitialCp = iInitialCp;
	this.sName = sName;
	this.sPokemonType = sPokemonType;
	this.iTotalMatchPlayed = iTotalMatchPlayed;
	this.iWon = iWon;
	this.iLost = iLost;
	
}

public float  CalPokemonCp()
{
	int diff;
	float fx;
	if(iWon>iLost)
	{
		diff=this.iWon-this.iLost;
	

		
	
	
		if( iWon>=1 && iWon <=20)	 
			fx = diff*0.1f;
		else if( iWon >=21 && iWon<=40)
	        fx=diff*0.25f;
		else if ( iWon >= 41 && iWon <= 60)
			fx=diff*0.40f;
		else
			fx=diff*0.5f;
	   fFinalCP=iInitialCp+fx;
	}
	else
	{
		diff= iLost-iWon;
		
		
		if( iLost>=1 && iLost <=20)	 
			fx = diff*0.1f;
		else if( iLost >=21 && iLost<=40)
	        fx=diff*0.25f;
		else if ( iLost >= 41 && iLost <= 60)
			fx=diff*0.40f;
		else
			fx=diff*0.5f;
	
		fFinalCP= iInitialCp-fx;
		
		
	}
	
	
	return fFinalCP;
	
	
	
	
	
}	







public int getiPokeId() {
	return iPokeId;
}

public int getiInitialCp() {
	return iInitialCp;
}

public String getsName() {
	return sName;
}

public String getsPokemonType() {
	return sPokemonType;
}

public int getiTotalMatchPlayed() {
	return iTotalMatchPlayed;
}

public int getiWon() {
	return iWon;
}

public int getiLost() {
	return iLost;
}




}
