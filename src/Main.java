public class Main {
    public static void main(String[] args) {
        // Задание.Объявляете переменные для входных данных и параметров программы: начального счёта, суммы пополнения и тп
        // Условным оператором проверяете превысила ли сумма пополнения порог и для этих двух разных сценариев
        // рассчитываете сумму бонуса и выводите на экран.

        int balance = 100; // - сумма денег на счету
        int replenishment = 1200; // - количество вносимых денег
        int bonusStep = 100; // - условие для начисления 1 бонуса, за каждый шаг, при пополнении боллее 1000

        // Коментарий "В примере лекции пустые переменные заводились просто (Пример из видео на 10:10 - int percent).
        // В моем случае программа не дает запустить пустую переменную, говорит, что нужно задать значение.
        // Хоть в конечном итоге все вроде бы и получилось, но меня что-то смущает.
        // Подскажите пожалуйста, что я с делал не так?"

        boolean accumulate = false; // - проверка, нужно ли нам производить начисление бонусов
        if (replenishment >= 1000) {
            accumulate = true;
        }
             int calc = 0; // - расчет количества начисленных бонсных рублей
        if (accumulate) {
            calc = replenishment / bonusStep;
        }
        int newBalance = balance + replenishment + calc;
        System.out.println("Ваш баланс составляет: " + newBalance + " рублей; " + "Вам начислено: " + calc + " бонусных рублей.");
    }
}
