package volbem.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 24596 on 2017/8/29.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    public  int getId(){return  id;}
    public  void setId(int id){this.id= id;}
    public String getCountyName(){return  countyName;}
    public void setCountyName(String countyName){this.countyName=countyName;}
    public  String weatherId(){return weatherId;}
    public  void  setWeatherId(int countyCode){this.weatherId= weatherId;}
    public int getCityId(){return cityId;}
    public void setCityId(int cityId){this.cityId=cityId;}
}

