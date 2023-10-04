
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;
        boolean itsContinued = true;
        while (itsContinued) {
            showMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "end":
                    itsContinued = false;
                    break;
                case "1":
                    System.out.println("Введите сумму дохода");
                    int money = Integer.parseInt(scanner.nextLine());
                    earnings += money;
                    break;
                case "2":
                    System.out.println("Введите сумму расхода");
                    money = Integer.parseInt(scanner.nextLine());
                    spendings += money;
                    break;
                case "3":
                    showResults(earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции нет!");
            }

        }

    }


    private static void showResults(int earnings, int spendings) {int taxSimple = taxEarningSimple(earnings);
        int taxNotSimple = taxErningMinusSpeandings(earnings, spendings);
        String typeTax = taxSimple < taxNotSimple ? "УСН доходы" : "УСН доходы - расходы";
        System.out.printf("Мы советуем вам %s", typeTax);
        System.out.printf("Ваш налог составит %d рублей\n", Math.min(taxSimple, taxNotSimple));
        System.out.printf("Налог на другой системе составит %d рублей\n", Math.max(taxSimple, taxNotSimple));
        System.out.printf("Экономия составит %d рублей\n", Math.abs(taxSimple - taxNotSimple));
    }

    private static int taxErningMinusSpeandings(int earnings, int spendings) {
        int tax = (earnings-spendings)*15/100;
        if (tax >=0){
            return tax;
        }
        return  0;}


    private static int taxEarningSimple(int earnings) {
        return earnings * 6/100;
    }

    private static void showMenu() {
        System.out.println("Выберите операцию и введите ее номер\n"+
                "1 .Добавить новый доход\n"+
                "2 .Добавить новый расход\n"+
                "3 .Выберите систему налогообложения\n"
        );
    }
}
