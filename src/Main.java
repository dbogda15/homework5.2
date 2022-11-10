public class Main {
    public static void main(String[] args) {
//задание 1
        float [] costs = {199999, 100009, 100703, 100801, 100900, 101000, 102000, 103000, 104500, 105000, 110000, 111000, 115000, 100010, 180000, 185000, 126000, 121000, 131000, 189000, 195000, 156067, 175432, 177654, 189076, 189666, 199765, 187986,100765, 102765};
        float sum = 0;
        for (float element : costs) {
        sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
//задание 2
        float maxCost = 99000;
        float minCost = 200001;
        for (float cost : costs) {
            if (cost >= maxCost) {
                maxCost = cost;
            }
            if (cost <= minCost) {
                minCost = cost;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей. Максимальная сумма трат за день составила " + maxCost + " рублей");
//задание 3
        float averageCost = sum / costs.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей");
//задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}