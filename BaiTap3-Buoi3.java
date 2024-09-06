class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Dai hoc";
        String str2 = "Dai Nam";
        String concatenatedStr = str1 + " " + str2;
        String upperCaseStr = concatenatedStr.toUpperCase();
        int length = upperCaseStr.length();
        System.out.println("Chuỗi kết quả (chữ in hoa): " + upperCaseStr);
        System.out.println("Chiều dài của chuỗi: " + length);
    }
}
