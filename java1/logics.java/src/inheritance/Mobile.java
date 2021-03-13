package inheritance;

public class Mobile extends ElectronicDevice{
	
       int ram;
       String camera;

       public Mobile()
       {
    	   super.brand="APPLE";
    	   super.modelno="asby223";
    	   ram=4;
    	   camera = "60mpx";
       }
       
       public Mobile(String mbd, String m_mdn, int r, String cam)
       {
    	   super(mbd, m_mdn);
    	   ram=r;
    	   camera=cam;
       }
       
       public String toString()
       {
    	   return super.toString()+" "+ram+" "+camera;
       }
}
