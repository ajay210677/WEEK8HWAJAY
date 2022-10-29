package methodoverriding24;

 class Test2 {
     public static void main(String args[]){
         Sbi s=new Sbi();
         Icici i=new Icici();
         Axis a=new Axis();
         System.out.println("Sbi Rate of Interest: "+s.getRateOfInterest());
         System.out.println("Icici Rate of Interest: "+i.getRateOfInterest());
         System.out.println("Axis Rate of Interest: "+a.getRateOfInterest());
     }
}
