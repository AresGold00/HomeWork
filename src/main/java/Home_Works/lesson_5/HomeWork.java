package Home_Works.lesson_5;



public class HomeWork {
    public static void main(String[] args) {
//        Staff staff1 = new Staff();
//        staff1.surname = "Муратов";
//        staff1.name = "Фёдор";
//        staff1.mName = "Николаевич";
//        staff1.post = "Рукаводитель";
//        staff1.email = "muratov@mail.ru";
//        staff1.pNumber = "89529714121";
//        staff1.salary = "45.000 р.";
//        staff1.age = 19;
//
//        System.out.println(staff1);
//        System.out.println(staff1.surname);
//        System.out.println(staff1.name);
//        System.out.println(staff1.mName);
//        System.out.println(staff1.post);
//        System.out.println(staff1.email);
//        System.out.println(staff1.pNumber);
//        System.out.println(staff1.salary);
//        System.out.println(staff1.age);

        Staff[] staff1 = new Staff[5];
        staff1[0] = new Staff("Muratov Fedor", "Main", "muratov12@gmail.com", "892312312",150000,41);
        staff1[1] = new Staff("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314",50000,32);
        staff1[2] = new Staff("Sidorov Ivan", "Chief accountant", "sidorov@mailbox.com", "892312315",10000,43);
        staff1[3] = new Staff("Pupkina Nadegda", "Chief Welder", "pupkina@mailbox.com", "892312316",5000,18);
        staff1[4] = new Staff("Konstantinov A", "Chief Designer", "juk@mailbox.com", "892312317",3000,39);
        for (Staff employee : staff1) {
            if (employee.getAge() >= 1) {
                System.out.println(employee);
            }
        }
    }
}
