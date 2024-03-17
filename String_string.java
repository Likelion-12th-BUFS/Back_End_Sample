class String_string {
    public static void main(String[] args) {
        String a = "Like"; // String constant pool 영역에 생성
        String b = new String("Lion"); // heap 영역에 별도로 생성
        String c = "Like";
        // String constant pool에 이미 값이 있을 경우 이미 생성된 reference 참조
        System.out.println(a + b);
        if(a == c) System.out.println("SAME");
    }
}