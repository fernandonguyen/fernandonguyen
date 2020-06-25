package Pattern;

public class Client{

    public static void main(String[] args){
        Vietnamese translateAdapter = new TranslateAdapter(new JapaneseApdaptee());
        translateAdapter.sendMessage("test");
    }
}
