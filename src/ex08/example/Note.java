//package ex08.example;
//
//public class StringEx01 {
//    public static void main(String[] args) {
//        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte
//        String converted = compressString(data);
//        System.out.println("Original String: " + data);
//        System.out.println("Converted String: " + converted);
//    }
//
//    public static String compressString(String input) {
//        StringBuilder result = new StringBuilder();
//
//        char[] chars = input.toCharArray();
//        char currentChar = chars[0];
//        int count = 1;
//
//        for (int i = 1; i < chars.length; i++) {
//            if (chars[i] == currentChar) {
//                count++;
//            } else {
//                result.append(currentChar);
//                result.append(count);
//                currentChar = chars[i];
//                count = 1;
//            }
//        }
//
//        // Append the last character sequence
//        result.append(currentChar);
//        result.append(count);
//
//        return result.toString();
//    }
//}
//
//package ex08.example;
//
//public class StringEx01 {
//    public static void main(String[] args) {
//        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte
//        String converted = compressString(data);
//        System.out.println("Original String: " + data);
//        System.out.println("Converted String: " + converted);
//    }
//
//    public static String compressString(String input) {
//        StringBuilder result = new StringBuilder();
//
//        int count = 1;
//        for (int i = 0; i < input.length() - 1; i++) {
//            if (input.charAt(i) == input.charAt(i + 1)) {
//                count++;
//            } else {
//                result.append(input.charAt(i));
//                result.append(count);
//                count = 1;
//            }
//        }
//
//        // Append the last character sequence
//        result.append(input.charAt(input.length() - 1));
//        result.append(count);
//
//        return result.toString();
//    }
//}

