public class Main {

    interface IA{

    }

    class CA{

    }

    class CB{

    }

    static int solution(String s) {
        int length = s.length();
        for(int i=0; i<length-1; i++){
            //System.out.println(s.charAt(i) + "," + s.charAt(i+1));
            if(s.charAt(i)=='0'&& s.charAt(i+1)=='1'){
                s = s.substring(0, i) + s.substring(i+2);
                length -= 2;
                if(i > 0){
                    i--;
                }else{
                    i++;
                }
            }
        }
        for(int i=length; i<0; i--){
            System.out.println(s.charAt(i) + "," + s.charAt(i-1));
            if(s.charAt(i)=='0'&& s.charAt(i-1)=='1'){
                System.out.println(i + "," + i+1);
                s = s.substring(0, i) + s.substring(i+2);
                length -= 2;
                if(i < 0){
                    i++;
                }else{
                    i--;
                }
            }
        }
        return length;
    }

    static int solution2(String s) {
        int length = s.length();
        for(int i=0; i<length-1; i++){
            if(s.charAt(i)=='0'&& s.charAt(i+1)=='1' || s.charAt(i)=='1' && s.charAt(i+1)=='0'){
                //s = s.substring(0, i) + s.substring(i+2);
                length -= 2;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println("Helper world!");
        String s1= "110*111000011100000";
        String s2 = "01101000";
        String s3 = "111000";
        System.out.println(solution2(s3));

    }


}