package Beans;

public class ReadingOrder extends IssueList {

    String orderBase; // basis for reading orders
    String orderType; // event or character

    public ReadingOrder(String id, String lt, String ln, String ob, String ot) {
     super(id,lt,ln);
     this.orderBase = ob;
     this.orderType = ot;
    }

    public String getOrderBase() {
        return orderBase;
    }

    public void setOrderBase(String orderBase) {
        this.orderBase = orderBase;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

}
