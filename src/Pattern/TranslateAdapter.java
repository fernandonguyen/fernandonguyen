package Pattern;

public class TranslateAdapter implements Vietnamese {

    JapaneseApdaptee apdaptee;
    public TranslateAdapter(JapaneseApdaptee apdaptee){
        this.apdaptee = apdaptee;
    }

    @Override
    public void sendMessage(String words) {
        this.translate(words);
    }

    public void translate(String words){
        if(words == "test"){
            apdaptee.sendMessage("arigato");
        }else{
            apdaptee.sendMessage("not found");
        }
    }
}
