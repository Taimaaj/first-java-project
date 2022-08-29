
    public class Car extends Vehicle{
    public  int      chairNum;
    public boolean  isFurnitreLeather;
 
     public Car(){
       chairNum = 0;
       isFurnitreLeather = false;
       length = 0;
       width = 0;
       color = "";
       manufactureCompany = "" ;
       manufactureDate = null;
       bodySerailNum = "";
       model =  ""  ;
       plateNum  =   "" ;
    }
    
    public Car( int chairNum,boolean  isFurnitreLeather) {
      this.chairNum = chairNum ;
      this.isFurnitreLeather =  isFurnitreLeather ;
      this.length = length;
      this.width = width;
      this.color = color;
      this.manufactureCompany = manufactureCompany;
      this.manufactureDate = manufactureDate;
      this.model = model;
      this.plateNum = plateNum;
      this.bodySerailNum =  bodySerailNum;
    }
    }
