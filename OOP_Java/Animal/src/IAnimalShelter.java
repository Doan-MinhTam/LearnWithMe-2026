interface IAnimalShelter {
    void addAnimal(IAnimal animal);
    void removeAnimal(String id);
    IAnimal findAnimalById(String id);
    java.util.List<IAnimal> findAnimalsBySpecies(String species);
    java.util.List<IAnimal> getAllAnimals();
    int getTotalAnimals();
    double getAverageWeight();
    java.util.List<IAnimal> sortAnimalsByAge();
}