public class HW11_12_2 {
    public static void main(String[] args) {
        int dianaSalary = 66_660;
        int andrewSalary = 77_770;
        int marySalary = 88_880;
        double dianaSalaryIncrease = dianaSalary + dianaSalary * 0.15;
        double dianaAnnualIncome = dianaSalaryIncrease * 12 - dianaSalary * 12;
        System.out.println("Диана теперь получает " + dianaSalaryIncrease + " рублей. Годовой доход вырос на " + dianaAnnualIncome + " рублей.");
        double andrewSalaryIncrease = andrewSalary + andrewSalary * 0.15;
        double andrewAnnualIncome = andrewSalaryIncrease * 12 - andrewSalary * 12;
        System.out.println("Андрей теперь получает " + andrewSalaryIncrease + " рублей. Годовой доход вырос на " + andrewAnnualIncome + " рублей.");
        double marySalaryIncrease = marySalary + marySalary * 0.15;
        double maryAnnualIncome = marySalaryIncrease * 12 - marySalary * 12;
        System.out.println("Мария теперь получает " + marySalaryIncrease + " рублей. Годовой доход вырос на " + maryAnnualIncome + " рублей.");
    }
}