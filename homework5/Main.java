package HomeWork;

//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
//* Конструктор класса должен заполнять эти поля при создании объекта;
//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
//* Создать массив из 5 сотрудников
//Пример:
//Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Шурыгин А.А.", "Специалист", "shuriginpro@ayndex.ru", "+7 (905) 730-71-09", 20000, 42);
        persArray[1] = new Person("Петров П.П.", "Ведущий специалист", "petrovpp@testcompany.ru", "+7 (111) 111-11-11", 35000, 34);
        persArray[2] = new Person("Иванов И.И.", "Главный специалист", "ivanovii@estcompany.ru", "+7 (222) 222-22-22", 40000, 41);
        persArray[3] = new Person("Александров А.А.", "Заместитель начальника отдела", "alexandrovaa@estcompany.ru", "+7 (333) 333-33-33", 50000, 39);
        persArray[4] = new Person("Васильев В.В.", "Начальник отдела", "vasilevvvo@estcompany.ru", "+7 (444) 444-44-44", 60000, 50);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                persArray[i].printPersonInfo();
            }
        }
    }
}
