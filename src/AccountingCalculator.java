public class AccountingCalculator {
    public static void main(String[] args) {
        int [] revenue = new int []{30, 20, 50, 10};
        int [] expenses = new int []{20, 30, 10, 20};
        int grossProfit=0;

        if(revenue != null && expenses != null && revenue.length == expenses.length) {
          grossProfit = calculateGrossProfit(revenue,expenses);

        }

        System.out.println("Gross Profit: " + grossProfit);

    }
     static int calculateGrossProfit(int[] revenue, int[] expenses) {

            int totalRevenue = calculateTotal(revenue); // sum all the values in revenue array
            int totalExpenses = calculateTotal(expenses); // sum all the values in expenses array
            System.out.println("Total Revenue : " + totalRevenue);
            System.out.println("Total Expenses : " + totalExpenses);
            int grossProfit = totalRevenue - totalExpenses;
            return grossProfit;

    }
     static int calculateTotal (int[]list) {
        int total = 0;
        for (int i=0; i< list.length; i++){
            total = total + list[i];
        }
        return total;
    }
}
