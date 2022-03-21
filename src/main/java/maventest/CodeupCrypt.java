package maventest;

public class CodeupCrypt {
   public static double version;

   public static String hashPassword(String stringToHash) {
      String hashedString = "";
      for (int i = 0; i < stringToHash.length(); i++) {
         char c = stringToHash.charAt(i);
         if( c == "a" || c == "A"){
            hashedString += "4";
         }else {
            hashedString += c;
         }
      }
      return hashedString;
   }
}
