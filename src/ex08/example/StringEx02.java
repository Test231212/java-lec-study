package ex08.example;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";

        int queryStartIndex = url.indexOf('?'); // URL에서 '?'의 인덱스를 찾아냄
        String queryString = url.substring(queryStartIndex + 1);
        // '?'이후 문자열을 추출하여 쿼리스트링으로 지정

        String[] queryS = queryString.split("&"); // split써서 & 기준으로 쪼갬

        // username값과, password값 찾아보기
        String username = ""; // 변수 초기화
        String password = "";


        for (String param : queryS) {
            String[] Value = param.split("="); // =을 기준으로 키와 값으로 분리
            if (Value[0].equals("username")) {
                username = Value[1];
            }
            if (Value[0].equals("password")) {
                password = Value[1];
            }
        }

        System.out.println("username: "+username);
        System.out.println("password: "+password);
    }
}