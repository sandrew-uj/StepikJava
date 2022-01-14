package asciistring;

public class AsciiCharSequence implements CharSequence {
    byte[] byteArray;

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = byteArray;
    }

    @Override
    public int length() {
        return byteArray.length;
    }

    @Override
    public char charAt(int index) {
        return (char)byteArray[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subByteArray = new byte[end - start];
        System.arraycopy(byteArray, start, subByteArray, 0, subByteArray.length);
        return new AsciiCharSequence(subByteArray);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < byteArray.length; i++) {
            res.append((char) byteArray[i]);
        }
        return res.toString();
    }
}
