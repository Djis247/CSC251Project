import java.util.Scanner;

public class Project_julien_shishkovskiy {
   public static void main(String args[]) {
      Scanner kbd = new Scanner(System.in);
      
      int policyNumber = 0;
      do {
         System.out.print("Please enter the Policy Number: ");
         policyNumber = kbd.nextInt();
         kbd.nextLine();
      } while (policyNumber < 0);
      
      String providerName = "";
      do {
         System.out.print("Please enter the Provider Name: ");
         providerName = kbd.nextLine();
      } while (providerName.length() == 0);
      
      String phFirst = "";
      do {
         System.out.print("Please enter the Policyholder's First Name: ");
         phFirst = kbd.nextLine();
      } while (phFirst.length() == 0);
      
      String phLast = "";
      do {
         System.out.print("Please enter the Policyholder's Last Name: ");
         phLast = kbd.nextLine();
      } while (phLast.length() == 0);
      
      int phAge = 0;
      do {
         System.out.print("Please enter the Policyholder's Age: ");
         phAge = kbd.nextInt();
         kbd.nextLine();
      } while (phAge < 0);
      
      String phSmokingStatus = "";
      do {
         System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         phSmokingStatus = kbd.nextLine();
      } while (phSmokingStatus.length() == 0 || (phSmokingStatus.compareToIgnoreCase("smoker") != 0 && phSmokingStatus.compareToIgnoreCase("non-smoker") != 0));
      
      double phHeight = 0.00;
      do {
         System.out.print("Please enter the Policyholder's Height (in inches): ");
         phHeight = kbd.nextDouble();
         kbd.nextLine();
      } while (phHeight < 0);
      
      double phWeight = 0.00;
      do {
         System.out.print("Please enter the Policyholder's Weight (in pounds): ");
         phWeight = kbd.nextDouble();
         kbd.nextLine();
      } while (phWeight < 0);
      
      Policy policy = new Policy(policyNumber, providerName, phFirst, phLast, phAge, phSmokingStatus, phHeight, phWeight);
      
      System.out.println("");
      System.out.printf("Policy Number: %d\n",                 policy.getPolicyNumber());
      System.out.printf("Provider Name: %s\n",                 policy.getProviderName());
      System.out.printf("Policyholder's First Name: %s\n",     policy.getPolicyholderFirstName());
      System.out.printf("Policyholder's Last Name: %s\n",      policy.getPolicyholderLastName());
      System.out.printf("Policyholder's Age: %d\n",            policy.getPolicyholderAge());
      System.out.printf("Policyholder's Smoking Status: %s\n", policy.getPolicyholderSmokingStatus());
      System.out.printf("Policyholder's Height: %,.1f\n",      policy.getPolicyholderHeight());
      System.out.printf("Policyholder's Weight: %,.1f\n",      policy.getPolicyholderWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n",         policy.calcBMI());
      System.out.printf("Policy Price: $%,.2f\n",              policy.calcPolicyPrice());
   }
}