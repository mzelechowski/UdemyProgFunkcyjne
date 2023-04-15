package v_klasaAnonimowa;

public class S2_5_klasaAnonimowa {
    public static void main(String[] args) {
        TextConverter textConverter = new SpaceTextConverter();
        String result=textConverter.convert("  Przykladow tekst  ");
        System.out.println(result);
        textConverter.display();

        TextConverter textConventer11 = new TextConverter() {
            @Override
            public String convert(String text) {
                return text.replace(" ", ".");
            }

            @Override
            public void display() {
                System.out.println("Hello from Anonimous class Text converter");
            }
        };
        String result1 = textConventer11.convert(" Przykladowy tekst anonimowy  ");
        System.out.println(result1);
        textConventer11.display();
    }
}
