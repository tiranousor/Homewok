public class AuthorWork {
    public static void main(String[] args) {
        Author NameM = new Author("Bruce Eckel", "Male", "BruceEckel@mail.us");
        Book NewBook1 = new Book("philosophy of java", NameM, 2003);
        System.out.println(NameM);
        System.out.println(NewBook1);
        Author NameM2 = new Author("Herbert Schildt", "Male", null);
        Book NewBook2 = new Book("A Beginner's Guide, 9th Edition ", NameM2, 2018);
        NewBook2.BookYear(2003);
        System.out.println(NameM2);
        System.out.println(NewBook2);
    }
}
