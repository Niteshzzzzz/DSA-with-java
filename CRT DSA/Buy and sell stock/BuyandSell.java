
public class BuyandSell {

    public static int maxProfit(int[] prices) {
        int left[] = new int[prices.length];
        left[left.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > left[i + 1]) {
                left[i] = prices[i];
            } else {
                left[i] = left[i + 1];
            }
        }
        int max = 0;
        for (int i = 0; i < left.length; i++) {
            left[i] = left[i] - prices[i];
        }
        for( int i = 0; i < left.length; i++) {
            if(left[i] > max){
                max = left[i];
            }
        }
        for (int i = 0; i < left.length; i++) {
            System.out.print(left[i]+" ");
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int p = maxProfit(arr);
        System.out.println(p);

    }

}
