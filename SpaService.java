public class SpaService 
{
   private String serviceDescription;
   private double price;

   public void SetserviceDescription(String service)
   { 
      serviceDescription = service;
   }
      public void SetPrice(double servicePrice)
      {
      price = servicePrice;
      }
         public SpaService()
   {
   serviceDescription = "XXX";
   price = 0;
      }
      
  
  
  public String getServiceDescription()
  {
   return serviceDescription;
   }
   public double getPrice()
   {
      return price;
   }
   
   }