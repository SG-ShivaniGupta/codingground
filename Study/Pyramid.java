class Pryamid {
  public static void main(String[] args) {
    int i, j;
    for (i = 1; i <= 10; i++) {
      for(j = 1; j <= 10-i; j++) {
           System.out.print(" ");
      }
      for(j=1;j<=2*i-1;j++) {
            System.out.print("*");    
      }
      System.out.println(); // Go to next line
    }
  }
}