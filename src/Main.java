public class Main {
    public static void main(String[] args) {
        LivroDigital ld = new LivroDigital("Senhor dos aneis", new Autor("Tolkien", "tolkien@eemail.com", "Britanico"), "Aventura", 5, 10000, 3500);
        ld.info();
    }
}