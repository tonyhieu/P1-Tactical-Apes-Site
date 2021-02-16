public class Rot13 {
  public void rot13(String phrase) {
    for (int i = 0; i < phrase.length(); i++) {
      if (containsSpecialCharacter(phrase.substring(i,i+1))) {
        System.out.print(phrase.charAt(i));
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
      System.out.print(c);
    }
  }
  public boolean containsSpecialCharacter(String s) {
    return (s == null) ? false : s.matches("[^A-Za-z0-9 ]");
  }
}
    
