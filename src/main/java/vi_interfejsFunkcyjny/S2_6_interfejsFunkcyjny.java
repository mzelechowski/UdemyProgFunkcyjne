package vi_interfejsFunkcyjny;

public class S2_6_interfejsFunkcyjny {
    public static void main(String[] args) {
        TextConverter textConverter = text -> text.replace(" ",".");
/*
        new TextConverter() {
            @Override
            public String convert(String text) {
                return text.replace(" ",".");
            }
        };
*/
        String result = textConverter.convert(" Przykladowy tekst anonimowy  ");
        System.out.println(result);
        textConverter.displayText();
        System.out.println(TextConverter.convertToLowerCase(result));

    }
}
