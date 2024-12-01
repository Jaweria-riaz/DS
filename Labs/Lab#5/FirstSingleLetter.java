public class FirstSingleLetter {
    public static char firstSingleLetter (String text, int n){
        int[]frequency =new int[26];

        for(int i=0;i<n;i++){
            char currentchar=text.charAt(i);

            frequency[currentchar-'A']++;
        }


        for(int i=0;i<n;i++){
            char currentchar=text.charAt(i);

           if(frequency[currentchar-'A']==1){
            return currentchar;
           }
        }

        return '\0';
    }

    public static void main (String[]args){
        String text="AEROPLANE";
        int n=text.length();

        char result=firstSingleLetter(text, n);

        if(result!='\0'){
            System.out.println("first non repeating character:"+result);
        }
        else{
            System.out.println("No non repeating character found");
        }
    }
}
