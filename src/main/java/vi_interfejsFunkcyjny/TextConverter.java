package vi_interfejsFunkcyjny;

@FunctionalInterface
public interface TextConverter {
    String convert(String text);

    // interfejs funkcyjny może mieć metody domyślne
    // medtody domyślne muszą mieć implementację
    default void displayText(){
        System.out.println("Hello from Functional Inteface");
    }

    //interfej może mieć metody statyczne
    // medtody statyczne muszą mieć implementację
    static String convertToLowerCase(String text){
        return text.toLowerCase();
    }

}
