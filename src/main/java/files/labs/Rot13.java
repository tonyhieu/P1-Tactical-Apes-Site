package files.labs;

public class Rot13 {
  public String rot13(String phrase) {
    String decoded = "Output: ";
    for (int i = 0; i < phrase.length(); i++) {
      if (containsSpecialCharacter(phrase.substring(i,i+1))) {
        decoded+=phrase.substring(i,i+1);
        continue;
      }
      char c = phrase.charAt(i);
      if (c>='a' && c<='m') {
        c+=13;
      }
      else if (c>='A' && c<='M') {
        c+=13;
      }
      else if (c>='N' && c<='Z') {
        c-=13;
      }
      else if (c>='n' && c<='z') {
        c-=13;
      }
      decoded+=c;
    }
    return decoded;
  }
  public boolean containsSpecialCharacter(String s) {
    return (s == null) ? false : s.matches("[^A-Za-z0-9 ]");
  }
}
    
