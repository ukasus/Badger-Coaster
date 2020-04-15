
public class BoardingGroup {
   private String name;
   private int numberofpeople;
   private String vip="";
   
 
   public String getVip() {
	return vip;
}


public void setVip(String vip) {
	this.vip = vip;
}


public BoardingGroup(String name, int numberofpeople) {
	super();
	this.setName(name);
	this.setNumberofpeople(numberofpeople);
}


   public int getNumberofpeople() {
	return numberofpeople;
}


   public void setNumberofpeople(int numberofpeople) {
	this.numberofpeople = numberofpeople;
}


   public String getName() {
	return name;
}


   public void setName(String name) {
	this.name = name;
}

}
