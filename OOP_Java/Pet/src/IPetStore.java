interface IPetStore {
    void addPet(IPet pet);
    void removePet(String id);
    IPet findPetById(String id);
    java.util.List<IPet> findPetsByType(String type);
    java.util.List<IPet> getAllPets();
    int getTotalPets();
    double getAveragePrice();
    java.util.List<IPet> sortPetsByPrice();
}