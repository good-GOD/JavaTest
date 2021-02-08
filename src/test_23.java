import java.util.Scanner;

public class test_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入itemCode, itemCount：");
        String str = sc.next();
        String[] st = str.split(",");
        if(st.length != 2)
            System.out.println("请正确输入!!");
        else {
            String itemCode = st[0];
            int itemCount = Integer.parseInt(st[1]);
            Order1.getOrderAmount(itemCode, itemCount);
        }
    }
}
class Item {
    private String ItemCode;
    private String ItemName;
    private double UnitPrice;

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        ItemCode = itemCode;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }
}
class Order1 {
    public static void getOrderAmount(String itemCode, int itemCount) {
        Item a = new Item();
        a.setItemCode("C_101");
        a.setItemName("HUAWEI Mate30 Pro");
        a.setUnitPrice(5000.00);
        Item b = new Item();
        b.setItemCode("C_102");
        b.setItemName(" XIAOMI 10 Pro");
        b.setUnitPrice(4699.00);
        if(itemCode.equals(a.getItemCode()))
            System.out.println("该订单的总金额为"+a.getUnitPrice()*itemCount);
        else if(itemCode.equals(b.getItemCode()))
            System.out.println("该订单的总金额为"+b.getUnitPrice()*itemCount);
        else
            System.out.println("无此商品");
    }
}