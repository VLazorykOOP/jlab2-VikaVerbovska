public class Vector3D {
    public double x, y, z;

    // Конструктор для створення вектора з трьома координатами
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Метод для знаходження модуля вектора
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Метод для множення вектора на скаляр
    public Vector3D multiplyByScalar(double scalar) {
        return new Vector3D(x * scalar, y * scalar, z * scalar);
    }

    // Метод для додавання двох векторів
    public Vector3D add(Vector3D other) {
        return new Vector3D(x + other.x, y + other.y, z + other.z);
    }

    // Метод для скалярного множення двох векторів
    public double dotProduct(Vector3D other) {
        return x * other.x + y * other.y + z * other.z;
    }

    // Метод для векторного множення двох векторів
    public Vector3D crossProduct(Vector3D other) {
        double crossX = y * other.z - z * other.y;
        double crossY = z * other.x - x * other.z;
        double crossZ = x * other.y - y * other.x;
        return new Vector3D(crossX, crossY, crossZ);
    }

    // Тестування класу
    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);

        System.out.println("v1: (" + v1.x + ", " + v1.y + ", " + v1.z + ")");
        System.out.println("v2: (" + v2.x + ", " + v2.y + ", " + v2.z + ")");

        System.out.println("Модуль v1: " + v1.magnitude());

        Vector3D v3 = v1.multiplyByScalar(2);
        System.out.println("v1 * 2: (" + v3.x + ", " + v3.y + ", " + v3.z + ")");

        Vector3D v4 = v1.add(v2);
        System.out.println("v1 + v2: (" + v4.x + ", " + v4.y + ", " + v4.z + ")");

        System.out.println("Скалярний добуток v1 i v2: " + v1.dotProduct(v2));

        Vector3D v5 = v1.crossProduct(v2);
        System.out.println("Векторний добуток v1 i v2: (" + v5.x + ", " + v5.y + ", " + v5.z + ")");
    }
}
