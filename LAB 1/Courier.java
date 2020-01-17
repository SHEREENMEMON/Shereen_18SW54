class Courier{
	int poids;
	boolean isExpress;
	String adresse;
	boolean isNotValid;

	Courier(int poids,boolean isExpress,String adresse){
		this.poids=poids;
		this.isExpress=isExpress;
		this.adresse=adresse;
	}

	public String isExpress(){
		return "Poids: "+poids+" adresse: "+adresse;
	}

	public double affranchirCourier(){
		return 2.2;
	}

	public void afficher(){
		System.out.println("Courier afficher's method");
	}
}
class Publicite extends Courier{
	double prix;
   
    Publicite(int poids,boolean isExpress,String adresse){
				super(poids,isExpress,adresse);
	}
	public double getPrix(){
		return prix;
	}
	public void afficher(){
		System.out.println("Publicite afficher's method");
	}
	public double affranchirCourier(){
		return 3.3;
	}
}
class Lettre extends Courier{
	String format;
	double prix=0;
    Lettre(int poids,boolean isExpress,String adresse,String format ) {
    	super(poids,isExpress,adresse);
    	this.format=format;
        }
     public double getPrix(){
     	return prix;
     } 
     public void afficher(){
     	System.out.println("Lettre afficher's method");
     } 
     public double affranchirCourier(){
     	return 4.4;
     }
}
class Colis extends Courier{
	double volume;
	double prix;
	Colis(int poids,boolean isExpress,String adresse,int volume){
		super(poids,isExpress,adresse);
		this.volume=volume;
			}
	public double getPrix(){
		return prix;
	}
	public void afficher(){
		System.out.println("Colis afficher's method");
	}
	public double affranchirCourier(){
		return 5.5;
	}
}