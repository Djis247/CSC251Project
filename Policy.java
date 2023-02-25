public class Policy {
   private int policyNumber;
   private String providerName;
   private String phFirstName;
   private String phLastName;
   private int phAge;
   private String phSmokingStatus; //"smoker" or "non-smoker"
   private double phHeight; //in Inches
   private double phWeight; //in Pounds
   
   //No-arg constructor
   public Policy() {
      this.policyNumber    = 0;
      this.providerName    = "";
      this.phFirstName     = "";
      this.phLastName      = "";
      this.phAge           = 0;
      this.phSmokingStatus = "non-smoker";
      this.phHeight        = 0.00;
      this.phWeight        = 0.00;
   }
   
   public Policy(int policyNumber, String providerName, String phFirst, String phLast, int phAge, String phSmokingStatus, double phHeight, double phWeight) {
      this.policyNumber    = policyNumber;
      this.providerName    = providerName;
      this.phFirstName     = phFirst;
      this.phLastName      = phLast;
      this.phAge           = phAge;
      this.phSmokingStatus = phSmokingStatus;
      this.phHeight        = phHeight;
      this.phWeight        = phWeight;
   }
   
   //Accessor methods
   /** @return the policy number */
   public int getPolicyNumber()                 { return policyNumber; }
   /** @return the provider's name */
   public String getProviderName()              { return providerName; }
   /** @return the policyholder's first name */
   public String getPolicyholderFirstName()     { return phFirstName; }
   /** @return the policyholder's last name */
   public String getPolicyholderLastName()      { return phLastName; }
   /** @return the policyholder's age */
   public int getPolicyholderAge()              { return phAge; }
   /** @return the smoking status of the policyholder */
   public String getPolicyholderSmokingStatus() { return phSmokingStatus; }
   /** @return the policyholder's height in inches */
   public double getPolicyholderHeight()        { return phHeight; }
   /** @return the policyholder's weight in pounds */
   public double getPolicyholderWeight()        { return phWeight; }
   
   //Mutator methods
   /** @param pn the policy number */
   public void setPolicyNumber(int pn)                   { this.policyNumber = pn; }
   /** @param pn the provider's name */
   public void setProviderName(String pn)                { this.providerName = pn; }
   /** @param fn the policyholder's first name */
   public void setPolicyholderFirstName(String fn)       { this.phFirstName = fn; }
   /** @param ln the policyholder's last name */
   public void setPolicyholderLastName(String ln)        { this.phLastName = ln; }
   /** @param age the policyholder's age */
   public void setPolicyholderAge(int age)               { this.phAge = age; }
   /** @param ss the policyholder's smoking status either "smoker" or "non-smoker" */
   public void setPolicyholderSmokingStatus(String ss)   { this.phSmokingStatus = ss; }
   /** @param h the policyholder's height in inches */
   public void setPolicyholderHeight(double h)           { this.phHeight = h; }
   /** @param w the policyholder's weight in pounds */
   public void setPolicyholderWeight(double w)           { this.phWeight = w; }
   
   //Calculating methods
   /** @return the BMI of the policyholder */
   public double calcBMI() {
      return (this.phWeight * 703) / (this.phHeight * this.phHeight);
   }
   /** @return the price of the policy */
   public double calcPolicyPrice() {
      double price = 600;
      if (this.phAge > 50) price += 75;
      if (this.phSmokingStatus == "smoker") price += 100;
      double bmi = this.calcBMI();
      if (bmi > 35) price += (bmi - 35) * 20;
      return price;
   }
}