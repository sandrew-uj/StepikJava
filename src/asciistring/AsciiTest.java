package asciistring;

public class AsciiTest {
    public static void main(String[] args) {
        byte[] byteArray = {48, 49, 100};
        var ascii = new AsciiCharSequence(byteArray);
        System.out.println(ascii);
        System.out.println(ascii.charAt(2));
        System.out.println(ascii.length());
        System.out.println(ascii.subSequence(1, 3));
    }
}
