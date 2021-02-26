package weater_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class VillageWeatherParsing {
	public static void main(String[] args) {
		try {
			
			/*요청정보입력
			 * 아래와 같은 정보들은 사용자가 가이드를 확인하여 찾으면됨
			 * 위도 경도는 엑셀파일 안에 있음
			 * 
			 */
			//자신이 조회를 원하는 지역의 위도와 경도 입력
			String nx = "92"; //경도
			String ny = "131"; //위도
			String baseDate = "20180502"; // 자신이 조회하고 싶은 날짜를 입력해주세요
			
			String baseTime = "0500"; //자신이 조회하고 싶은 시간대 입력
			
			//서비스 인증키 
			String serviceKey = "W4gJBrjc6NqWpBDA3A5ZS9WA%2FdqrHSk7R8ONAslxyabq3ZamHHIovb5BV7wZsk%2Fgz1FuXPPhGI3HfL4%2F%2FZvyrw%3D%3D";
			
			//정볼르 모아서 URL 정보로 만들면 됨 맨마지막에 "&_type=json"에 따라 반환 데이터 형태 지정
			String urlStr = "http://newsky2.kma.go.kr/service/SecndSrtpdFrcstInfoService2/ForecastSpaceData?" + "serviceKey=" + serviceKey + "&base_date=" + baseDate + "&base_time=" + baseTime + "&nx="+ nx + "&ny=" + ny + "&_type=json";
			
			URL url = new URL(urlStr); //위 urlStr을 이용해서 URL 객체를 만듬
			BufferedReader bf;
			String line ="";
			String result = "";
			
			//날씨정보 받아옴
			bf = new BufferedReader(new InputStreamReader(url.openStream()));
			
			//버퍼에 있는 정보를 하나의 문자열로 변환.
			while((line=bf.readLine()) != null) {
				result = result.concat(line);
				System.out.println(result); //받은 데이터 확인
			}
			
			// Json parser를 만들어 만들어진 문자열 데이터를 객체화
		
	}
}
}
