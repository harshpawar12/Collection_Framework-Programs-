package ArrayList;

public class RootNode {

    public static void main(String[] args) {
        double totalBonus = 3000000.0;
        double budBonus = totalBonus * 0.25;
        double saleBonus = totalBonus * 0.75;

        int[] sub= {5,4,3,2,1,0};
        double[] sale = {1200000,800000,600000,400000,300000,200000};

        distributeBonus(budBonus, sub);
        distributeBonus(saleBonus, sale);
    }

    public static void distributeBonus(double totalBonus,double[] value) {
        double sum = 0;
        for (double val : value) 
        {
            sum += val;
        }
        for (int i = 0; i < value.length; i++) 
        {
            double bonus = (value[i] / sum) * totalBonus;
            System.out.println("highest nuumber of sales:"+(i + 1)+":₹"+bonus);
        }
    }

    public static void distributeBonus(double totBonus, int[] val) {
        int sum = 0;
        for (int value : val) {
            sum += value;
        }
        for (int i = 0; i < val.length; i++) {
            double bonus = (val[i] / (double) sum)*totBonus;
            System.out.println("Sales Executive SE" + (i + 1) + ": ₹" + bonus);
        }
    }
}
