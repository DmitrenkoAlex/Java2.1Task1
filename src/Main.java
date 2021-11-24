public class Main {
    public static void main(String[] args) {

        int ticketCost = 5990; // Введите стоимость билета
        int bonus = 20; // количество рублей за одну бонусную милю
        int bonusMiles = ticketCost / bonus; // расчет бонусных миль.Дробные не начисляются
        System.out.println("Бонусные мили:" + bonusMiles); // вывод на экран количества бонусных миль

    }
}
