package Ex3;
//Bài 3: Viết chương trình thực hiện các yêu cầu sau:
//- Tạo lớp đối tượng hình chữ nhật có tên là Rectangle theo lược đồ dưới đây:
//Rectange
//- width: double Chiều rộng hình chữ nhật
//- height: double Chiều dài hình chữ nhật
//- color: String Màu hình chữ nhật
//+ Rectange() Tạo HCN có c.dài = 1, c.rộng = 1
//+ Rectange(width: double, height: double, color: String) Tạo HCN có c.dài, c.rộng xác định qua tham số
//+ getWidth() :double Trả về chiều rộng
//+ setWidth(width:double): void Thiết lập chiều rộng mới
//+ getHeight(): double Trả về chiều dài
//+ setHeight(height:double): void Thiết lập chiều dài mới
//+ getColor(): String Trả về màu của HCN
//+ setColor(color): void Thiết lập màu mới cho HCN
//+ findArea(): double Tính và trả về diện tích HCN
//+ findPerimeter(): double Tính và trả về chu vi HCN
//- Từ chương trình chính, tạo một đối tượng hình chữ nhật với kích thước và màu sắc nhập vào từ bàn
//phím. Đưa ra màn hình các thuộc tính, diện tích và chu vi của đối tượng hình chữ nhật đã tạo.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();
        String color = rectangle.getColor();
        rectangle.input();
        width = rectangle.getWidth();
        height = rectangle.getHeight();
        color = rectangle.getColor();

        rectangle.setWidth(5);
        rectangle.setHeight(5);
        rectangle.setColor("Blue");
        width = rectangle.getWidth();
        height = rectangle.getHeight();
        color = rectangle.getColor();
        double area = rectangle.findArea();
        double perimeter = rectangle.findPerimeter();
        System.out.println("The area of the rectangle is"+area);
        System.out.println("The perimeter of the rectangle is"+perimeter);
    }
}
