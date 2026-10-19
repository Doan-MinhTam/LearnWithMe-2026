/**
 * Class Animal - Đại diện cho một con vật
 * 
 * Mô tả:
 * - Class này đại diện cho một con vật trong trung tâm cứu hộ
 * - Cần implements interface IAnimal
 * 
 * Thuộc tính:
 * - id: String - Mã con vật (unique)
 * - name: String - Tên con vật
 * - species: String - Loài (ví dụ: "Dog", "Cat", "Rabbit")
 * - age: int - Tuổi
 * - weight: double - Cân nặng (kg)
 * 
 * Yêu cầu:
 * 1. Tạo constructor với đầy đủ 5 tham số
 * 2. Implement tất cả methods từ interface IAnimal
 * 3. Override toString() để in thông tin con vật theo format:
 *    "Animal[id='<id>', name='<name>', species='<species>', age=<age>, weight=<weight>kg]"
 * 
 * Gợi ý:
 * - Khai báo 5 thuộc tính private tương ứng với 5 thông tin của con vật
 * - Constructor dùng để gán giá trị cho tất cả thuộc tính
 * - Các method getter chỉ cần trả về đúng thuộc tính tương ứng
 * - Có thể dùng String.format("%.2f", weight) để in weight đẹp hơn trong toString()
 */
class Animal implements IAnimal {
    // TODO: Khai báo các thuộc tính
    private String id;
    private String name;
    private String species;
    private int age;
    private double weight;
    // TODO: Tạo constructor

    public Animal(String id, String name, String species, int age, double weight) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
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
    public String getSpecies() {
        return species;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    // TODO: Override toString()

    @Override
    public String toString() {
        return  String.format("Animal[id='"+id+"', name='"+name+"', species='"+species+"', age="+age+", weight=%.2fkg]", weight);
    }
}