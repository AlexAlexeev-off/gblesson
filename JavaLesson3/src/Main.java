import java.util.Scanner;

public class Main {
    static int min;
    static int max;
    static int lives;
    static int quest;
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        gameNumber();
        gameWords(words);
    }

    /**
     * 1 Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это
     * число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
     * или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? y/n».
     */
    public static void gameNumber() {
        int guess;
        do {
            init();
            do {
                guess = getNumber();
                isGuessed(quest, guess);
                lives--;
            } while (lives > 0 && quest != guess);
            System.out.println((lives == 0 && quest != guess) ? "Ты проигра!" : "");
        } while (isExit());
        System.out.println("Игра окончена");
    }

    public static boolean isExit() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Хотите сыграть еще раз в \"Угадай число\" (Y/N)?");
        String exit = scn.nextLine().toLowerCase();
        return exit.charAt(0) == 'y';
    }

    public static boolean isGuessed(int quest, int guess) {
        System.out.println((guess == quest) ? "Поздравляю, вы угадали!" :
                (guess > quest) ? "Меньше" : "Больше");
        return guess == quest;
    }

    public static int getNumber() {
        int x;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.printf("Введите число от %d до %d пожалуйста \n", min, max, quest);
            while (!scn.hasNextInt()) {
                System.out.println("Введите число пожалуйста");
                scn.nextLine();
            }
            x = scn.nextInt();
        } while (x > min && max < x);
        return x;
    }

    public static void init() {
        min = 0;
        max = 9;
        lives = 3;
        quest = min + (int) (Math.random() * max - min);
        System.out.println("Угадайте число, сгенерированное компьютером.\nУ тебя есть " + lives + " попытки");
    }

    public static String init(String... words) {
        min = 0;
        max = words.length;
        quest = min + (int) (Math.random() * max - min);
        return words[quest];
    }
    /**
     * 2 * Создать массив из слов
     * String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
     * "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
     * "pineapple", "pumpkin", "potato"};
     * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с
     * загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает
     * буквы которые стоят на своих местах.
     * apple – загаданное
     * apricot - ответ игрока
     * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
     * Для сравнения двух слов посимвольно, можно пользоваться:
     * String str = "apple";
     * str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
     * Играем до тех пор, пока игрок не отгадает слово
     * Используем только маленькие буквы
     */
    public static void gameWords(String[] words) {
        String questWord;
        String guessWord;
        StringBuffer visualWord = new StringBuffer("###############");
        questWord = init(words);
        Scanner scn = new Scanner(System.in);
        int minLength;
        do {
            System.out.printf("Введите загаданное слово \n", questWord);
            guessWord = scn.next().toLowerCase();
            scn.nextLine();
            minLength = (questWord.length() > guessWord.length()) ? guessWord.length() : questWord.length();
            if (!questWord.equals(guessWord)) {
                for (int i = 0; i < minLength; i++) {
                    if (questWord.charAt(i) == guessWord.charAt(i))
                        visualWord.setCharAt(i, questWord.charAt(i));
                    else
                        visualWord.setCharAt(i, '#');
                }
                for (int i = minLength; i < visualWord.length(); i++) {
                    visualWord.setCharAt(i, '#');
                }
                System.out.println("Ваш результат: "+visualWord.toString());
            } else break;
        } while (true);
        System.out.println("Вы угадали!");
    }
}