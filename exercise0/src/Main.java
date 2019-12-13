public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter", "black", "J.K. Rowling", "medium", 2008, 340, false, true);
        book1.nameAndAuthur();
        book1.publishAndPages();
        book1.isNewOne();

        Pet pet1 = new Pet("David", "Lucy", "cat", "female", "white", 3, 2016,true);
        pet1.isDomestic();
        pet1.showBreed();
        pet1.showOwner();

        Roommate roommate1 = new Roommate("David", "Male", "US", "student", 23, 1996, 183, true);
        roommate1.isSingle();
        roommate1.isStudent();
        roommate1.show();
    }
}
