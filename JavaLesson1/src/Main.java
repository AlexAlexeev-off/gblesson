public class Main {
    public static void main(String[] args) {
    System.out.println("Hello, World!");
    }

//        Задание 2
//        Создать переменные всех пройденных типов данных, и инициализировать их значения;
//        byte	8-битное знаковое целое число	от -128 до 127	byte val = -120;
//        short	16-битное знаковое целое число	от -32768 до 32767	short val = 12442;
//        int	32-битное знаковое целое число	от -2147483648 до 2147483647	int val = 1000;
//        long	64-битное знаковое целое число	от -9223372036854775808 до 9223372036854775807	long val = 200000L;
//        float	32-битное знаковое число с плавающей запятой одинарной точности		float val = 12.23f;
//        double	64-битное знаковое число с плавающей запятой двойной точности		double val = -123.123;
//        char	16-битный тип данных, предназначенный для хранения символов в кодировке Unicode	от '\u0000' или 0
//        до '\uffff' или 65,535	char val1 = ‘*’; char val2 = ‘\u2242’;
//        boolean	логический тип данных	false, true	boolean val = false;

            public static void peremen() {
                byte by = 127;
                short st = 12419;
                char ch = 'A';
                int in = 24;
                long lo = 124124L;
                float fl = 12.345949f;
                double dou = 4323.45345;
                boolean boo = true;
            }

//          Задание 3
//          Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//          где a, b, c, d – входные параметры этого метода;

            static double vichislitVozvrat(double a, double b, double c, double d) {
                return a * (b + (c / d));
            }

//          Задание 4
//          Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
//          пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

            static boolean vPredelah(int one, int two) {
                int sum = one + two;
                return sum > 9 && sum < 21;
            }

//          Задание 5
//          Написать метод, которому в качестве параметра передается целое число, метод должен
//          напечатать в консоль положительное ли число передали, или отрицательное;
//          Ноль считаем положительным числом

            static void polozhOtric(int num) {
                String word = "Положительное";
                if (num < 0) word = "Отрицательное";

                System.out.println(word);
            }

//          Задание 6
//          Написать метод, которому в качестве параметра передается целое число, метод должен
//          вернуть true, если число отрицательное;

            static boolean metodTrue(int num) {
                return num < 0;
            }

//          Задание 7
//          Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//          метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

            static void printName(String name) {
                System.out.printf("Привет, %s!\n", name);
            }


//          Задание 8
//          Написать метод, который определяет является ли год високосным, и выводит сообщение в
//          консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
//          високосный.

            static void printYear(int year) {
                if (isLeapYear(year)) {
                    System.out.println("Високосный");
                } else {
                    System.out.println("Не високосный");
                }
            }

            private static boolean isLeapYear(int year) {
                if (((year % 4) == 0) && !((year % 100) == 0)) {
                    return true;
                } else if ((year % 400) == 0) {
                    return true;
                }
                return false;
            }
        }
