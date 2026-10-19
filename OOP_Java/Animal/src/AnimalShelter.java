import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class AnimalShelter - Quản lý danh sách con vật
 * <p>
 * Mô tả:
 * - Class này quản lý danh sách các con vật trong trung tâm cứu hộ
 * - Cần implements interface IAnimalShelter
 * - Sử dụng ArrayList để lưu trữ danh sách con vật
 * <p>
 * Thuộc tính:
 * - animals: List<IAnimal> - Danh sách các con vật (sử dụng ArrayList)
 * <p>
 * Yêu cầu:
 * 1. Tạo constructor khởi tạo ArrayList rỗng
 * 2. Implement các methods:
 * - addAnimal(): Thêm con vật vào danh sách
 * - removeAnimal(): Xóa con vật theo ID (nếu tìm thấy)
 * - findAnimalById(): Tìm con vật theo ID (trả về null nếu không tìm thấy)
 * - findAnimalsBySpecies(): Tìm tất cả con vật theo loài
 * - getAllAnimals(): Trả về danh sách tất cả con vật
 * - getTotalAnimals(): Trả về tổng số con vật
 * - getAverageWeight(): Trả về cân nặng trung bình của tất cả con vật
 * - sortAnimalsByAge(): Trả về danh sách con vật đã sắp xếp theo tuổi tăng dần
 * 3. Override toString() để in danh sách con vật, mỗi con vật trên một dòng
 * <p>
 * LƯU Ý:
 * - Method sortAnimalsByAge() phải tạo bản sao của danh sách trước khi sắp xếp
 * - Không làm thay đổi danh sách gốc
 * <p>
 * Gợi ý:
 * - Khai báo: private List<IAnimal> animals;
 * - Constructor: animals = new ArrayList<>();
 * - Với removeAnimal(), có thể duyệt danh sách bằng chỉ số rồi xóa khi tìm thấy ID phù hợp
 * - Với findAnimalById(), duyệt từng phần tử và so sánh animal.getId().equals(id)
 * - Với findAnimalsBySpecies(), tạo một list kết quả rồi thêm các con vật cùng loài vào
 * - Với getAverageWeight(), nếu danh sách rỗng thì return 0.0
 * - Với sortAnimalsByAge(), có thể dùng:
 * Collections.sort(sorted, Comparator.comparingInt(IAnimal::getAge));
 */
class AnimalShelter implements IAnimalShelter {
    // TODO: Khai báo thuộc tính
    private List<IAnimal> iAnimalList;
    // TODO: Tạo constructor

    public AnimalShelter() {
        this.iAnimalList = new ArrayList<>();
    }

    // TODO: Implement các methods từ interface

    @Override
    public void addAnimal(IAnimal animal) {
        iAnimalList.add(animal);
    }

    @Override
    public void removeAnimal(String id) {
        for (IAnimal animal : iAnimalList) {
            if (animal.getId().equals(id)) {
                iAnimalList.remove(animal);
            }
        }
    }

    @Override
    public IAnimal findAnimalById(String id) {
        for (IAnimal animal : iAnimalList) {
            if (animal.getId().equals(id)) {
                return animal;
            }
        }
        return null;
    }

    @Override
    public List<IAnimal> findAnimalsBySpecies(String species) {
        List<IAnimal> results = new ArrayList<>();
        for (IAnimal animal : iAnimalList) {
            if (animal.getSpecies().equals(species)) {
                results.add(animal);
            }
        }
        return results;
    }

    @Override
    public List<IAnimal> getAllAnimals() {
        return iAnimalList;
    }

    @Override
    public int getTotalAnimals() {
        return iAnimalList.size();
    }

    @Override
    public double getAverageWeight() {
        double totalWeight = 0.0;
        for (IAnimal animal : iAnimalList) {
            totalWeight += animal.getWeight();
        }
        return totalWeight / iAnimalList.size();
    }

    @Override
    public List<IAnimal> sortAnimalsByAge() {
        List<IAnimal> results = new ArrayList<>(iAnimalList);
        results.sort(Comparator.comparing(IAnimal::getAge));
        return results;
    }

    // TODO: Override toString()

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (IAnimal animal : iAnimalList) {
            sb.append(animal.getName()).append("\n");
        }
        return sb.toString();
    }
}