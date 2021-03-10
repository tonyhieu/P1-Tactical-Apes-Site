package files.labs;

public class Caesar {
  public String caesar(int shift, String phrase) {
      String decoded = "\"" + phrase + "\"" + " decodes to \"";
      for (int i = 0; i < phrase.length(); i++) {
        if (containsSpecialCharacter(phrase.substring(i,i+1))) {
          decoded+=phrase.substring(i,i+1);
          continue;
        }
        char c = 'a';
        if (Character.isUpperCase(phrase.charAt(i))) {
          c = (char)(((int)phrase.charAt(i) +
                  shift - 65) % 26 + 65);
        }
        else if (Character.isLowerCase(phrase.charAt(i))){
          c =(char)(((int)phrase.charAt(i) +
                  shift - 97) % 26 + 97);
        }
        decoded+=c;
      }
    decoded+="\" with a shift of ";
    decoded+=" ";
    decoded+= String.valueOf(shift);
    return decoded;
  }
  public boolean containsSpecialCharacter(String s) {
      return (s == null) ? false : s.matches("[^A-Za-z]");
  }
}
