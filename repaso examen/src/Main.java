public class Main {
    public static void main(String[] args) {
        try{
            division(7,2);
        }catch(ArithmeticException e){
            System.out.println("ERROR , ES UN 0");{

            }
        }
        catch(Exception e){
            System.out.println("error inserperado");

        }
        finally {
            System.out.println("cambia el 0 por otro numero");
        }
    }
    public static void division(int num, int num2){
        int re=num/num2;
        System.out.println(re);
    }
}