import java.util.Base64;

public class DecodeStringUsingBase64 {

    public static void main(String[] args) {
        String encodedString="dXNlMg==";
        Base64.Decoder decoder= Base64.getDecoder();
        byte[] bytes=decoder.decode(encodedString);
        System.out.println(new String(bytes));
        DecodeStringUsingBase64 decodeStringUsingBase64=new DecodeStringUsingBase64();
        String newDecodedString = decodeStringUsingBase64.decodeString(encodedString);
        System.out.println("Decoded string is: " + newDecodedString);
    }

    public String decodeString(String encodedString){
        Base64.Decoder decoder= Base64.getDecoder();
        byte[] bytes=decoder.decode(encodedString);
        System.out.println(new String(bytes));
        return (new String(bytes));
    }
}