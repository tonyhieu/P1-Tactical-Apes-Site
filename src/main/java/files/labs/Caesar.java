package files.labs;

public class Caesar {
  public void caesar(int shift, String phrase) {
      for (int i = 0; i < phrase.length(); i++) {
        if (containsSpecialCharacter(phrase.substring(i,i+1))) {
          System.out.print(phrase.charAt(i));
          continue;
        }
        char c = phrase.charAt(i);
        if (c>='a' && c<=('z'-shift)) {
          c+=shift;
        }
        else if (c>='A' && c<=('Z'-shift)) {
          c+=shift;
        }
        else if (c>=('Z'-(shift-1)) && c<='Z') {
          c-=shift;
        }
        else if (c>=('z'-(shift-1)) && c<='z') {
          c-=shift;
        }
        System.out.print(c);
      }
  }
  public boolean containsSpecialCharacter(String s) {
      return (s == null) ? false : s.matches("[^A-Za-z0-9 ]");
  }
}
