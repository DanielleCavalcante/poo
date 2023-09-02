/**
 *
 * @author Danielle
 */
public class Exemplo6 {
    public static void main(String[] args) {
        double[] tabNum;
        tabNum = new double[5];
        
        for(int i=0; i<5; i++){
            tabNum[i] = Math.random() * 100;;
            System.out.println(tabNum[i]);
        }
        
    }
}
