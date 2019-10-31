public class Anagram {

    public String createAnagram(String str){

        StringBuffer sb = new StringBuffer("");
        for(int i=str.length(); i=1; i--){
                sb.append(str.charAt[i]);
        }
        return sb.toString();
    }
}
