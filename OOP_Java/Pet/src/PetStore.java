import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class PetStore - Quản lý danh sách thú cưng
 * <p>
 * Mô tả:
 * - Class này quản lý danh sách các thú cưng trong cửa hàng
 * - Cần implements interface IPetStore
 * - Sử dụng ArrayList để lưu trữ danh sách thú cưng
 * <p>
 * Thuộc tính:
 * - pets: List<IPet> - Danh sách các thú cưng (sử dụng ArrayList)
 * <p>
 * Yêu cầu:
 * 1. Tạo constructor khởi tạo ArrayList rỗng
 * 2. Implement các methods:
 * - addPet(): Thêm thú cưng vào danh sách
 * - removePet(): Xóa thú cưng theo ID (nếu tìm thấy)
 * - findPetById(): Tìm thú cưng theo ID (trả về null nếu không tìm thấy)
 * - findPetsByType(): Tìm tất cả thú cưng theo loại
 * - getAllPets(): Trả về danh sách tất cả thú cưng
 * - getTotalPets(): Trả về tổng số thú cưng
 * - getAveragePrice(): Trả về giá trung bình của tất cả thú cưng
 * - sortPetsByPrice(): Trả về danh sách thú cưng đã sắp xếp theo giá tăng dần
 * 3. Override toString() để in danh sách thú cưng, mỗi thú cưng trên một dòng
 * <p>
 * LƯU Ý:
 * - Method sortPetsByPrice() phải tạo bản sao của danh sách trước khi sắp xếp
 * - Không làm thay đổi danh sách gốc
 * <p>
 * Gợi ý:
 * - Khai báo: private List<IPet> pets;
 * - Constructor: pets = new ArrayList<>();
 * - Với removePet(), có thể duyệt danh sách bằng chỉ số rồi xóa khi tìm thấy ID phù hợp
 * - Với findPetById(), duyệt từng phần tử và so sánh pet.getId().equals(id)
 * - Với findPetsByType(), tạo một list kết quả rồi thêm các thú cưng cùng loại vào
 * - Với getAveragePrice(), nếu danh sách rỗng thì return 0.0
 * - Với sortPetsByPrice(), có thể dùng:
 * Collections.sort(sorted, Comparator.comparingDouble(IPet::getPrice));
 */
class PetStore implements IPetStore {
    // TODO: Khai báo thuộc tính
    private List<IPet> iPetList;
    // TODO: Tạo constructor

    public PetStore() {
        this.iPetList = new ArrayList<>();
    }

    // TODO: Implement các methods từ interface

    @Override
    public void addPet(IPet pet) {
        iPetList.add(pet);
    }

    @Override
    public void removePet(String id) {
        for (IPet pet : iPetList) {
            if (pet.getId().equals(id)) {
                iPetList.remove(pet);
            }
        }
    }

    @Override
    public IPet findPetById(String id) {
        for (IPet pet : iPetList) {
            if (pet.getId().equals(id)) {
                return pet;
            }
        }
        return null;
    }

    @Override
    public List<IPet> findPetsByType(String type) {
        List<IPet> results = new ArrayList<>();
        for (IPet pet : iPetList) {
            if (pet.getType().equals(type)) {
                results.add(pet);
            }
        }
        return results;
    }

    @Override
    public List<IPet> getAllPets() {
        return iPetList;
    }

    @Override
    public int getTotalPets() {
        return iPetList.size();
    }

    @Override
    public double getAveragePrice() {
        double totalPrice = 0.0;
        for (IPet pet : iPetList) {
            totalPrice += pet.getPrice();
        }
        return totalPrice / iPetList.size();
    }

    @Override
    public List<IPet> sortPetsByPrice() {
        List<IPet> results = new ArrayList<>(iPetList);
        results.sort(Comparator.comparing(IPet::getPrice));
        return results;
    }

    // TODO: Override toString()

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (IPet pet : iPetList) {
            sb.append(pet.getName()).append("\n");
        }
        return sb.toString();
    }
}