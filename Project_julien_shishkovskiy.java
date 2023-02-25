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
      } catch (FileNotFoundException e) {}
   }
}