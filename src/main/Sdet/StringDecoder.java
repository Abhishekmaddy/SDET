package Sdet;

import org.apache.commons.lang.StringUtils;

public class StringDecoder {


    public static void decode() {
        String str = "a2b3c4";
        for (int i = 0; i <= str.length() - 1; i++) {
            String temp = "";
            for (int j = i + 1; j <= str.length() - 1; j++) {
                if (StringUtils.isNumeric(String.valueOf(str.charAt(j)))) {
                    int cnt = Integer.parseInt(String.valueOf(str.charAt(j)));
                    while (cnt > 0) {
                        temp = temp + str.charAt(i);
                        cnt = cnt - 1;
                    }
                    break;
                } else {
                    break;
                }
            }
            try {
                System.out.print(temp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        decode();
    }

}


//    public static void DecodeString() {
//        String str = "a2b3c4";
//
//        for (int i = 0; i <= str.length() - 1; i++) {
//            String temp2 = "";
//            for (int j = i + 1; j <= str.length() - 1; j++) {
//                int cnt = 0;
//                if (StringUtils.isNumeric(String.valueOf(str.charAt(j)))) {
//                    cnt = Integer.parseInt(String.valueOf(str.charAt(j)));
//                    while (cnt >= 0) {
//                        temp2 = temp2 + str.charAt(i);
//                        cnt = cnt - 1;
//                    }
//                    break;
//                } else {
//                    break;
//                }
//            }
//            try {
//                System.out.print(temp2);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        StringDecoder.DecodeString();
//    }
//
//}


//public class StringDecoder {
//
//
//    public static void main(String[] args) {
//        String str = "a3b3c4";
//        String decodedString = decodeString(str);
//        System.out.println(decodedString);
//    }
//
//    public static String decodeString(String str) {
//        StringBuilder decoded = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++) {
//            char chr = str.charAt(i);
//
//            if (Character.isLetter(chr)) {
//                decoded.append(chr);
//            } else if (Character.isDigit(chr)) {
//                int repeatCount = Character.getNumericValue(chr);
//                // Duplicate the current letter based on the digit
//                for (int j = 0; j < repeatCount - 1; j++) {
//                    decoded.append(decoded.charAt(decoded.length() - 1));
//                }
//            }
//        }
//
//        return decoded.toString();
//    }
//}


