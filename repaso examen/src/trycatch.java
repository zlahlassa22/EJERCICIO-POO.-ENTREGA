public class trycatch {
    public static void main(String[] args) {
        int value=0;
        try {
            value=value+1;
            value= value+ Integer.parseInt("10");
            value=value+1;
            System.out.println("EL VALOR DE VALUE ES "+value);
        }catch (NumberFormatException e){
            value=value+10;
            System.out.println("ERROR");
        }finally {
            System.out.println("PERFECT");
        }
    }
}
