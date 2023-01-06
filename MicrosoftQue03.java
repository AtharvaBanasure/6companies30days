import java.util.*;
class MicrosoftQue03 {
    public static String getHint(String secret, String guess) {
        int n=secret.length();
        int count=0;
        ArrayList<Character>arr1=new ArrayList<>();
        ArrayList<Character>arr2=new ArrayList<>();
        ArrayList<Character>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr1.add(secret.charAt(i));
            arr2.add(guess.charAt(i)); 
        }
        for(int i=0;i<arr1.size();i++){
            if(arr1.get(i)==arr2.get(i)){
                count++;             
            }else{
                arr.add(arr2.get(i));
            }
        }

        int cow=0;    
        for(int i=0;i<arr1.size();i++){
            if(arr1.get(i)!=arr2.get(i)){
            if(arr.contains(arr1.get(i))){
                cow++;
                arr.remove(arr1.get(i));
            }
            }
        }
        
        String beforeA=String.valueOf(count);
        String beforeB=String.valueOf(cow);

        String s="";
        s=s+beforeA;
        s=s+"A";
        s=s+beforeB;
        s=s+"B";
        return s;
    }
    public static void main(String[] args) {
        String secret="11";
        String guess="11";
        System.out.println(getHint(secret,guess));
    }
}