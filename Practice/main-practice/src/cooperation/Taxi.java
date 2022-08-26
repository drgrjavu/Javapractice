package cooperation;

public class Taxi {

  String taxiClass;
  int money;

  public Taxi(String taxiClass) {
    this.taxiClass = taxiClass;
  }

  public void take(int money) {
    this.money += money;
  }

  public void showInfo() {
    System.out.println(taxiClass + "택시 수입은 "  
        + money + "입니다.");
  }


}
