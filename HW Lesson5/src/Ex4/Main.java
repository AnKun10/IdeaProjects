package Ex4;
//Bài 4:
//- Tạo lớp đối tượng điểm trong mặt phẳng tọa độ OXY có tên là MyPoint theo lược đồ dưới đây:
//MyPoint
//- x: double Tọa độ x
//- y: double Tọa độ y
//+ MyPoint() Tạo đối tượng mặc định
//+ MyPoint(x: double, y: double) Tạo đối tượng có tọa độ xđ trong tham số
//+ MyPoint(p: MyPoint) Tạo đối tượng là bản sao của đối tượng trong t.số
//+ getX(): double Trả về tọa độ X
//+ getY(): double Trả về tọa độ Y
//+ distance(secondPoint: MyPoint): double Trả về khoảng cách từ điểm này tới điểm thứ hai
//+distance(p1: MyPoint, p2: MyPoint): double Trả về khoảng cách giữa hai điểm
//Viết chương trình tạo n đối tượng điểm MyPoint có tọa độ nhập vào từ bàn phím. Tìm hai điểm có khoảng cách
//lớn nhất. Đưa ra màn hình tọa độ của hai điểm tìm được và giá trị khoảng cách giữa chúng
public class Main {
    public static void main(String[] args) {
        MyPoint system = new MyPoint(1,1);
        MyPoint[] points = system.input();
        system.findTwoFurthestPoints(points);
    }
}
