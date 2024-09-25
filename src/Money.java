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
        return hryvnias + "," + String.format("%02d", kopecks); // Повертає рядок у форматі "гривні,копійки", де копійки завжди відображаються двозначним числом (наприклад, 05 замість 5)
    }

    public static void main(String[] args) {  // Точка входу для виконання програми.
        Money money1 = new Money(10, (byte) 50);  // Створення об'єкта Money 'money1' із 10 одиницями та 50 копійками.
        Money money2 = new Money(5, (byte) 75);  // Створення об'єкта Money 'money2' із 5 одиницями та 75 копійками.
    
        System.out.println("Money1: " + money1);  // Виведення значення 'money1'. Метод toString() класу Money має обробляти форматування.
        System.out.println("Money2: " + money2);  // Виведення значення 'money2'.
    // додавання
        Money sum = money1.add(money2);  // Додавання 'money1' до 'money2', результат зберігається в 'sum'.
        System.out.println("Сума: " + sum);  // Виведення суми 'money1' та 'money2'.
    // віднімання
        Money diff = money1.subtract(money2);  // Віднімання 'money2' від 'money1', результат зберігається в 'diff'. 
        System.out.println("Різниця: " + diff);  // Виведення різниці між 'money1' та 'money2'.
    // ділення
        Money divided = money1.divideByNumber(2);  // Ділення 'money1' на 2, результат зберігається в 'divided'.
        System.out.println("Ділення на 2: " + divided);  // Виведення результату ділення 'money1' на 2.
    // порівняння
        if (money1.equals(money2)) {  // Перевірка, чи рівні 'money1' і 'money2' за допомогою методу equals.
            System.out.println("Суми рівні");  // Виведення повідомлення, що 'money1' і 'money2' рівні.
        } else {  
            System.out.println("Суми не рівні");  // Виведення повідомлення, що 'money1' і 'money2' не рівні.
        }
    }
    
        }
    }
}
