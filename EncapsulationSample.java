public class EncapsulationSample {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        
       
        student1.setStudent_Id(1234);
        student1.setName("Nino");
            
        
        System.out.println("Student ID: " + student1.getStudent_Id());
        System.out.println("Name: " + student1.getName());
        

        Book book1 = new Book();
        
       
        book1.setBook_Number(1001);
        book1.setTitle("Java Programming");
        book1.setAuthor(" Agquiz Nino Joseph");
        book1.setPrice(29.99);
        
        
        System.out.println("\nBook Number: " + book1.getBook_Number());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: $" + book1.getPrice());
    }
}