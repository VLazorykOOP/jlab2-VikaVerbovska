public class Money {
    long hryvnias; //Оголошуєм поле типу long (велике ціле число) з ім'ям hryvnias.
    byte kopecks; //Оголошуєм поле типу byte (маленьке ціле число) з ім'ям kopeck.

    // Конструктор
    public Money(long hryvnias, byte kopecks) {
        if (kopecks >= 100) {
            hryvnias += kopecks / 100;
            kopecks = (byte) (kopecks % 100);
        }
        this.hryvnias = hryvnias;
        this.kopecks = kopecks;
    }

    // Додавання
    public Money add(Money other) {
        long newHryvnias = this.hryvnias + other.hryvnias;
        byte newKopecks = (byte) (this.kopecks + other.kopecks);
        return new Money(newHryvnias, newKopecks);
    }

    // Віднімання
    public Money subtract(Money other) {
        long totalKopecks1 = this.hryvnias * 100 + this.kopecks;
        long totalKopecks2 = other.hryvnias * 100 + other.kopecks;
        long resultKopecks = totalKopecks1 - totalKopecks2;
        return new Money(resultKopecks / 100, (byte) (resultKopecks % 100));
    }

    // Ділення на число
    public Money divideByNumber(int number) {
        long totalKopecks = this.hryvnias * 100 + this.kopecks;
        totalKopecks /= number;
        return new Money(totalKopecks / 100, (byte) (totalKopecks % 100));
    }

    // Порівняння
    public boolean equals(Money other) {
        return this.hryvnias == other.hryvnias && this.kopecks == other.kopecks;
    }

    // Виведення
    public String toString() {
        return hryvnias + "," + String.format("%02d", kopecks);
    }

    public static void main(String[] args) {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(5, (byte) 75);

        System.out.println("Money1: " + money1);
        System.out.println("Money2: " + money2);

        Money sum = money1.add(money2);
        System.out.println("Сума: " + sum);

        Money diff = money1.subtract(money2);
        System.out.println("Рiзниця: " + diff);

        Money divided = money1.divideByNumber(2);
        System.out.println("Дiлення на 2: " + divided);

        if (money1.equals(money2)) {
            System.out.println("Суми рiвнi");
        } else {
            System.out.println("Суми не рiвнi");
        }
    }
}
