public class LibraryFine {

  public static void main(String[] args) {
    int daysLate;

    // Get the number of days late from the user
    System.out.println("Enter the number of days the book is late: ");
    Scanner scanner = new Scanner(System.in);
    daysLate = scanner.nextInt();

    String message = calculateFine(daysLate);
    System.out.println(message);
  }

  public static String calculateFine(int daysLate) {
    if (daysLate <= 0) {
      return "Book returned on time. No fine.";
    } else if (daysLate <= 7) {
      double fine = daysLate * 0.5; // 50 paise per day
      return String.format("Fine: ₹%.2f", fine);
    } else if (daysLate <= 14) {
      return "Fine: ₹1.00";
    } else if (daysLate <= 21) {
      return "Fine: ₹5.00";
    } else {
      return "Membership cancelled due to late return (more than 21 days).";
    }
  }
}