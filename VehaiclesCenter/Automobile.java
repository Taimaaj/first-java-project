import java.util.Date;
public class Automobile {
    Engine Engine; 
    
    public  String  manufactureCompany;
    public  String  model ;
    public  String  plateNum ;
    public  String  bodySerailNum;
    public  Date    manufactureDate;

    public Automobile(){
       manufactureCompany =notdecided          ;
       manufactureDate    = 0/0/0000;
       bodySerailNum   =            ;
       model  =  null               ;
       plateNum  =                  ;
    }
    public Automobile(String manufactureCompany ,Date manufactureDate,String model ,String plateNum ,String bodySerailNum ){
      manufactureCompany = manufactureCompany;
      manufactureDate=manufactureDate;
      model=model;
      plateNum=  plateNum;
      bodySerailNum= bodySerailNum;
    } 
    }