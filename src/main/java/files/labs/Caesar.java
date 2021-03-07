package files.labs;

public class Caesar {
  public String caesar(int shift, String phrase) {
      String decoded = "\"" + phrase + "\"" + " decodes to \"";
      for (int i = 0; i < phrase.length(); i++) {
        if (containsSpecialCharacter(phrase.substring(i,i+1))) {
          decoded+=phrase.substring(i,i+1);
          continue;
        }
        char c = phrase.charAt(i);
        if (c>='a' && c<=('z'-shift)) {
          c+=shift;
          decoded+=c;
        }
        else if (c>='A' && c<=('Z'-shift)) {
          c+=shift;
          decoded+=c;
        }
        else if (c>=('Z'-(shift-1)) && c<='Z') {
          c-=shift;
          decoded+=c;
        }
        else if (c>=('z'-(shift-1)) && c<='z') {
          c-=shift;
          decoded+=c;
        }
      }
    decoded+="\" with a shift of ";
    decoded+=" ";
    decoded+= String.valueOf(shift);
    return decoded;
  }
  public boolean containsSpecialCharacter(String s) {
      return (s == null) ? false : s.matches("[^A-Za-z0-9 ]");
  }
}
