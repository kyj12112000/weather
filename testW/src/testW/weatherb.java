package testW;

public class weatherb {
	
    public static void main(String[] args) {
        
        String Response = "";
        String[] ResponseData ;
        String end = "";
        Weather WeatherAPI = new Weather();
        
        //fn_time 함수를 사용하여 현재시간 받아오기
        String timedata = WeatherAPI.fn_time();
        
        //현재시간을 활용하여 기상청 시간데이터 형식에 맞게 변환
        String HH = WeatherAPI.fn_timeChange(timedata);
        String YMD = timedata.substring(0, 8);
        
        //경도 //위도
        String nx = "60";
        String ny = "127";
        
        //연결하기 위한 파라미터들
         Response = WeatherAPI.fn_APIConnect(YMD, HH, nx, ny);
         ResponseData = Response.split(",");
         
         System.out.print(ResponseData[0]);
         System.out.println(" " + ResponseData[1]);
         System.out.print(ResponseData[2]);
         System.out.println(" " + ResponseData[3]);
         System.out.print(ResponseData[4]);
         System.out.println(" " + ResponseData[5]);
         System.out.print(ResponseData[8]);
         System.out.println(" " + ResponseData[9]);
         System.out.print(ResponseData[12]);
         System.out.println(" " + ResponseData[13]);
         System.out.print(ResponseData[16]);
         System.out.println(" " + ResponseData[17]);
         System.out.print(ResponseData[20]);
         System.out.println(" " + ResponseData[21]);
         System.out.print(ResponseData[24]);
         System.out.println(" " + ResponseData[25]);
         System.out.print(ResponseData[28]);
         System.out.println(" " + ResponseData[29]);
         System.out.print(ResponseData[32]);
         System.out.println(" " + ResponseData[33]);
         
         
         
     
 
    }
 
}