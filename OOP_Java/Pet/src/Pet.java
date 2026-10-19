/**
 * Class Pet - Đại diện cho một thú cưng
 * 
 * Mô tả:
 * - Class này đại diện cho một thú cưng trong cửa hàng
 * - Cần implements interface IPet
 * 
 * Thuộc tính:
 * - id: String - Mã thú cưng (unique)
 * - name: String - Tên thú cưng
 * - type: String - Loại thú cưng (ví dụ: "Dog", "Cat", "Hamster")
 * - age: int - Tuổi
 * - price: double - Giá bán
 * 
 * Yêu cầu:
 * 1. Tạo constructor với đầy đủ 5 tham số
 * 2. Implement tất cả methods từ interface IPet
 * 3. Override toString() để in thông tin thú cưng theo format:
 *    "Pet[id='<id>', name='<name>', type='<type>', age=<age>, price=<price>]"
 * 
 * Gợi ý:
 * - Khai báo 5 thuộc tính private tương ứng với 5 thông tin của thú cưng
 * - Constructor dùng để gán giá trị cho tất cả thuộc tính
 * - Các method getter chỉ cần trả về đúng thuộc tính tương ứng
 * - Có thể dùng String.format("%.2f", price) để in price đẹp hơn trong toString()
 */
class Pet implements IPet {
    // TODO: Khai báo các thuộc tính
    private String id;
    private String name;
    private String type;
    private int age;
    private double price;
    // TODO: Tạo constructor

    public Pet(String id, String name, String type, int age, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.price = price;
    }

    // TODO: Implement các methods từ interface

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getPrice() {
        return price;
    }

    // TODO: Override toString()

    @Override
    public String toString() {
        return String.format("Pet[id='"+id+"', name='"+name+"', type='"+type+"', age="+age+", price=%.2f]",price);

    }
}