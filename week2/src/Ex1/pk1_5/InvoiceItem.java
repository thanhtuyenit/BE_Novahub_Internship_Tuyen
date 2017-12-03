package Ex1.pk1_5;

public class InvoiceItem {
  String id;
  String desc;
  int    qty;
  double unitPrice;

  public InvoiceItem() {
    super();
    // TODO Auto-generated constructor stub
  }

  public InvoiceItem(String id, String desc, int qty, double unitPrice) {
    super();
    this.id = id;
    this.desc = desc;
    this.qty = qty;
    this.unitPrice = unitPrice;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getTotal() {
    return getUnitPrice() * getQty();
  }

  @Override
  public String toString() {
    return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
  }

}
