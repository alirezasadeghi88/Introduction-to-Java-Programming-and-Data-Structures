public class Hex2Dec {
    public static void main(String[] args) {

    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
             char hexChar = hex.charAt(i);
             decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }


        return decimalValue;
    }
}
