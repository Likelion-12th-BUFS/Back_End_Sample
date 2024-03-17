class Number_long {
    public static void main(String[] args) {
        long a = 10;
        System.out.println(a);

        long b = 20L;
        System.out.println(b);

        long c = 2147483648L; // int 허용 범위 ~ 2147483647
        System.out.println(c);

        // long err_num = 9223372036854775808L;
		// 위 코드 실행 시 long에서 허용하는 범위를 넘어서 에러가 발생 (out of range)
    }
}