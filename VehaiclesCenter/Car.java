
public class Car
{
    public int chair_num;
 public boolean is_furnitre_leather;
    public Car()
    {
        chair_num=0;
        is_furnitre_leather =false;
        length=0;
       width=0;
       color=null;
        Manufacture_Company=null;
        Manufacture_date=null;
        model=null;
        Plate_num=0;
        Body_serail_num=0;
    }
    
    public Car( int chair_num,boolean is_furnitre_leather) 
    {
     chair_num= chair_num;
     is_furnitre_leather=is_furnitre_leather;
      length=length;
       width=width;
       color=color;
      Manufacture_Company=Manufacture_Company;
      Manufacture_date=Manufacture_date;
      model=model;
      Plate_num= Plate_num;
      Body_serail_num= Body_serail_num;

    }
    
    
    public int Add (int chair_num)
    {
        return  chair_num  ;
    }
}
