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
   public int getPolicyNumber()                 { return policyNumber; }
   public String getProviderName()              { return providerName; }
   public String getPolicyholderFirstName()     { return phFirstName; }
   public String getPolicyholderLastName()      { return phLastName; }
   public int getPolicyholderAge()              { return phAge; }
   public String getPolicyholderSmokingStatus() { return phSmokingStatus; }
   public double getPolicyholderHeight()        { return phHeight; }
   public double getPolicyholderWeight()        { return phWeight; }
   
   //Mutator methods
   public void setPolicyNumber(int pn)                   { this.policyNumber = pn; }
   public void setProviderName(String pn)                { this.providerName = pn; }
   public void setPolicyholderFirstName(String fn)       { this.phFirstName = fn; }
   public void setPolicyholderLastName(String ln)        { this.phLastName = ln; }
   public void setPolicyholderAge(int age)               { this.phAge = age; }
   public void setPolicyholderSmokingStatus(String ss)   { this.phSmokingStatus = ss; }
   public void setPolicyholderHeight(double h)           { this.phHeight = h; }
   public void setPolicyholderWeight(double w)           { this.phWeight = w; }
   
   //Calculating methods
   public double calcBMI() {
      return (this.phWeight * 703) / (this.phHeight * this.phHeight);
   }
   public double calcPolicyPrice() {
      double price = 600;
      if (this.phAge > 50) price += 75;
      if (this.phSmokingStatus == "smoker") price += 100;
      double bmi = this.calcBMI();
      if (bmi > 35) price += (bmi - 35) * 20;
      return price;
   }
}