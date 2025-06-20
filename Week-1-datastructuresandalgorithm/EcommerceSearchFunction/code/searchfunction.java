
import java.util.*;
public class searchfunction {
    public static void main(String[] args) {
        
        List<String> products = Arrays.asList("Shirt", "Shoes", "Watch", "Phone");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine().toLowerCase();

        System.out.println("Search Results:");
        for (String product : products) {
            if (product.toLowerCase().contains(keyword)) {
                System.out.println(product);
            }
        }
    }
}
