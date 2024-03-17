class Number_float {
    public static void main(String[] args) {
        float a = 23.5f; // 실수 값을 할당 시 뒤에 f가 없으면 컴파일 에러 발생
        System.out.println(a);

        float b = 20;
        System.out.println(b);

        System.out.println(a + b);

        a = 10;
        System.out.println(a / b); // 만약 정수형 데이터라면 0을 출력
    }
}
