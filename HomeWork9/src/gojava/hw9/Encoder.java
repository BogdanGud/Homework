package gojava.hw9;


public class Encoder {
    private static int offset;

    public Encoder(int offset) {
        this.offset = offset;
    }

    public static String decode(String enc) {
        int decodeOffset = 26 - offset;
        StringBuilder decoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    decoded.append((char) ('A' + (i - 'A' + decodeOffset) % 26));
                } else {
                    decoded.append((char) ('a' + (i - 'a' + decodeOffset) % 26));
                }
            } else {
                decoded.append(i);
            }
        }
        return decoded.toString();
    }

    public static String encode(String enc) {
        int encodeOffset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + encodeOffset) % 26));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + encodeOffset) % 26));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
}
