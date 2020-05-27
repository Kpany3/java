package HomeWork;


public class Person {
    String fio;
    String position;
    String email;
    String phone;
    int pay;
    int age;

    Person(String fio, String position, String email, String phone, int pay, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    void printPersonInfo() {
        System.out.println("Сотрудник: " + fio + " на должности " + position + " получает зарплату " + pay + ". Возраст " + age + ". Контактный телефон и почта: " + phone + ", " + email);
    }
}
