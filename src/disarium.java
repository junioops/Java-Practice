import java.io.*;
class disarium {
    public static void main(String args[])throws IOException {
        String num = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int list[] = conviStr(num), oNum = origNum(num), chk = 0; // convert String to array
        for(int i = 1; i <= list.length; i++)
            chk += Math.pow(list[i - 1], i);
        if(oNum == chk) System.out.println("It is a disarium number.");
        else System.out.println("It is not a disarium number.");
    }
    static int[] conviStr(String x) {
        int[] result = new int[x.length()];
        for(int y = 0; y < x.length(); y++)
            result[y] = x.charAt(y) - 48;
        return result;
    }
    static int origNum(String x) {
        int result = 0;
        for(int y = x.length() - 1, z = 1; y > -1; y--) {
            result += (z * (x.charAt(y) - 48));
            z *= 10;
        }
        return result;
    }
}
