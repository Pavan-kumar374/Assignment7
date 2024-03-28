public class VowelChecker {

  public static void main(String[] args) {
    String str = "This is a string with vowels";
    int vowelCount = countVowels(str);

    if (vowelCount > 0) {
      System.out.println("Yes, the string contains " + vowelCount + " vowels.");
    } else {
      System.out.println("No, the string does not contain any vowels.");
    }
  }

  public static int countVowels(String str) {
    int count = 0;
    str = str.toLowerCase();  // Convert to lowercase for case-insensitive check
    for (char c : str.toCharArray()) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        count++;
      }
    }
    return count;
  }
}