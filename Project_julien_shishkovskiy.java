import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Project_julien_shishkovskiy {
   public static void main(String args[]) {
      try {
         File policyFile = new File("PolicyInformation.txt");
         Scanner policyInformation = new Scanner(policyFile);
         ArrayList<Policy> policies = new ArrayList<Policy>();
         
         while(policyInformation.hasNextLine()) {
            int policyNumber = policyInformation.nextInt();
            policyInformation.nextLine();
            
            String providerName = policyInformation.nextLine();
            String phFirst = policyInformation.nextLine();
            String phLast = policyInformation.nextLine();
            
            int phAge = policyInformation.nextInt();
            policyInformation.nextLine();
            
            String phSmokingStatus = policyInformation.nextLine();
            
            double phHeight = policyInformation.nextDouble();
            policyInformation.nextLine();
            
            double phWeight = policyInformation.nextDouble();
            if (policyInformation.hasNextLine()) policyInformation.nextLine();
            
            Policy policy = new Policy(policyNumber, providerName, phFirst, phLast, phAge, phSmokingStatus, phHeight, phWeight);
            policies.add(policy);
         }
         
         int numSmoker = 0;
         for(Policy policy : policies) {
            if (policy.getPolicyholderSmokingStatus().equalsIgnoreCase("smoker")) numSmoker++;
            
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
         System.out.println();
         System.out.printf("The number of policies with a smoker is: %d\n", numSmoker);
         System.out.printf("The number of policies with a non-smoker is: %d\n", policies.size() - numSmoker);
      } catch (FileNotFoundException e) {}
   }
}