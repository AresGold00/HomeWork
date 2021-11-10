package Home_Works.lesson_5;

    public class Staff {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;


        public Staff() {

    }

    public Staff (String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
        @Override
        public String toString(){
            return(name+ "\n-"
                    +position+ "\n-"
                    +email+ "\n-"
                    +phone+ "\n-"
                    +salary+ "\n-"
                    +age);
        }

}
