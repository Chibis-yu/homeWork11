public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        System.out.println(firstName);
        String middleName = "Ivanovich";
        System.out.println(middleName);
        String lastName = "Ivanov";
        System.out.println(lastName);
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
        public static void task2() {
            System.out.println("Задача 2");
        String fullName = "Иванов Иван Иванович";
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");
        System.out.println(fullName);
    }
}

