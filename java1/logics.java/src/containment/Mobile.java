package containment;

public class Mobile {

     String brand_m;
     String model;
     Sim sim;
     
   public Mobile()
   {
	   brand_m = "SAMSUNG";
	   model = "abc123";
	   sim = new Sim(); 
   }
   
   public Mobile(String br_m, String md_m, Sim s1)
   {
	   brand_m = br_m;
	   model = md_m;
	   sim = s1;
	   
   }
   
   public String toString()
   {
	   return brand_m+ " "+model+" "+sim;
   }
	
}
