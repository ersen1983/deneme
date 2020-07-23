public class C {
    public static void main(String[] args)
    {
        System.out.println("ertugrul");
        System.out.println("conflict");
        gitMethod();
    }
    public static void gitMethod(){
        for (int i = 0; i > 100; i++) {
            System.out.println(i);
            System.out.println(i+2);

        }
    }
    public static String firstLetterWriter(String word){
        return word.substring(0,1).toUpperCase();

    }
}
