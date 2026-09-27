public class Main {
    public static void main(String[] args) {

        // =========================
        // 1. TẠO AGENCY
        // =========================
        RentalAgency agency = new RentalAgency();

        // =========================
        // 2. THÊM XE
        // =========================
        Car car1 = new Car(
                "C01",
                "Toyota",
                "Vios",
                500000,
                4
        );

        Car car2 = new Car(
                "C02",
                "Honda",
                "City",
                600000,
                4
        );

        Motorcycle motorcycle1 = new Motorcycle(
                "M01",
                "Honda",
                "Wave Alpha",
                150000,
                110
        );

        Motorcycle motorcycle2 = new Motorcycle(
                "M02",
                "Yamaha",
                "Exciter",
                200000,
                150
        );

        agency.addVehicle(car1);
        agency.addVehicle(car2);
        agency.addVehicle(motorcycle1);
        agency.addVehicle(motorcycle2);

        // =========================
        // 3. THÊM KHÁCH HÀNG
        // =========================
        Customer customer1 =
                new Customer("KH01", "Ngô Bảo Châu");

        Customer customer2 =
                new Customer("KH02", "Lê Bá Khánh Trình");

        agency.addCustomer(customer1);
        agency.addCustomer(customer2);

        // =========================
        // 4. TEST RENT VEHICLE
        // =========================
        System.out.println(
                agency.rentVehicle("KH01", "C01")
        );

        System.out.println(
                agency.rentVehicle("KH02", "M02")
        );

        System.out.println(
                agency.rentVehicle("KH01", "M02")
        );

        System.out.println(
                agency.rentVehicle("KH01", "C99")
        );

        // =========================
        // 5. TEST RETURN VEHICLE
        // =========================
        System.out.println(
                agency.returnVehicle("C01")
        );

        System.out.println(
                agency.returnVehicle("C01")
        );

        // =========================
        // 6. TEST CALCULATE TOTAL COST
        // =========================

        // Tạo một RentalRecord để test riêng calculateTotalCost()
        RentalRecord record =
                new RentalRecord(car1, customer1);

        System.out.println(
                "Tổng chi phí (1 ngày): "
                        + (int) record.calculateTotalCost()
                        + " VND"
        );
    }
}
