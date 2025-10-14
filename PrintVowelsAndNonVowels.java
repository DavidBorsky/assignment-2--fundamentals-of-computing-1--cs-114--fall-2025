
public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    java.util.Scanner in = new java.util.Scanner(System.in);
    String prompt = "";
    // Read entire input line (or multiple lines if provided via pipe)
    if (System.console() != null) {
      System.out.println("Enter a string:");
    }
    String line = in.nextLine();

    int a = 0, e = 0, i = 0, o = 0, u = 0, nonVowel = 0;

    for (int idx = 0; idx < line.length(); idx++) {
      char c = line.charAt(idx);
      switch (c) {
        case 'a': a++; break;
        case 'e': e++; break;
        case 'i': i++; break;
        case 'o': o++; break;
        case 'u': u++; break;
        default: nonVowel++; break;
      }
    }

    System.out.println("a:" + a);
    System.out.println("e:" + e);
    System.out.println("i:" + i);
    System.out.println("o:" + o);
    System.out.println("u:" + u);
    System.out.println("Non-vowel characters: " + nonVowel);
    in.close();
  }
}

