    public class Vehicle extends Automobile{  
    public int      length;
    public int      width;
    public String   color;
    
    public Vehicle(){
       length = 0;
       width = 0;
       color="";
       manufactureCompany = "" ;
       manufactureDate = null;
       bodySerailNum = "";
       model =  ""  ;
       plateNum  =   "" ;
    }

    public Vehicle(int length ,int width ){
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