public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte variable1 = 100;
        short variable2 =32760;
        int variable3 = 2147483640;
        long variable4 = 922337036854775800L;
        float variable5 = 3.14f;
        double variable6 = 1.796458984554;
        char variable7 = 'h';
        boolean variable8 = true;
        //Задача 2
        float weightAthlete_1 =78.2f;
        float weightAthlete_2 =82.7f;
        float totalWeight = weightAthlete_1 + weightAthlete_2;
        float weightDifference = weightAthlete_2 - weightAthlete_1;
        System.out.println("Общий вес спортсменов " + totalWeight + "кг");
        System.out.println("Разница в весе спортсменов " + weightDifference + "кг");
        //Задача 3
        short weightBananas = 5*80;
        short weightMilk = 2*105;
        short weightIceCream = 2*100;
        short weightEggs = 4*70;
        float totalWeightProducts = weightBananas + weightMilk + weightEggs + weightIceCream;
        float weightInKilograms = totalWeightProducts/1000;
        System.out.println("Вес готового завтрака " + weightInKilograms + "кг");
        //Задача 4
        short weightDumped = 7*1000;
        int daysInFirstCase = weightDumped/250;
        int daysInSecondCase = weightDumped/500;
        int averageResult =  (daysInFirstCase+daysInSecondCase)/2;
        System.out.println(daysInFirstCase + " дней потребуется если спортсмен будет сбрасывать по 250г в день.");
        System.out.println(daysInSecondCase + " дней потребуется если спортсмен будет сбрасывать по 500г в день.");
        System.out.println(averageResult + " день потребуется в среднем.");
        //Задача 5
        int salaryMashaBefore = 67760;
        int salaryDenisBefore = 83690;
        int salaryKristinaBefore = 76230;
        double salaryMashaAfter = salaryMashaBefore + (salaryMashaBefore * 0.1);
        double salaryDenisAfter = salaryDenisBefore + (salaryDenisBefore * 0.1);
        double salaryKristinaAfter = salaryKristinaBefore + (salaryKristinaBefore * 0.1);
        double yearIncomeMasha = (salaryMashaAfter-salaryMashaBefore)*12;
        double yearIncomeDenis = (salaryDenisAfter-salaryDenisBefore)*12;
        double yearIncomeKristina = (salaryKristinaAfter-salaryKristinaBefore)*12;
        System.out.println("Маша теперь получает " + salaryMashaAfter + " рублей. Годовой доход вырос на " + yearIncomeMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisAfter + " рублей. Годовой доход вырос на " + yearIncomeDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaAfter + " рублей. Годовой доход вырос на " + yearIncomeKristina + " рублей.");
    }
}