public class _72findpermutaions {
    public static void findpermu(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length();i++){
            char curr=str.charAt(i);
            // ""abcde" = "ab"+"de"= "abde"
            String Newstr=str.substring(0,i)+str.substring(i+1);
            findpermu(Newstr,ans+curr);
        }
        

    }
    public static void main(String[] args) {
        String str="abc";
        findpermu(str,"");
    }
}
