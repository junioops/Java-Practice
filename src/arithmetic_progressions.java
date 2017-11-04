import java.util.ArrayList;

class arithmetic_progressions {
    public static void main(String args[]) {
        // to search for arithmetic progressions in the array
        ArrayList<Integer> progression = new ArrayList<>();
        int arr[] = {3, 7, 10, 11, 12, 15}, greatest = 0, p_i = 1; // progression index
        for(int i : arr) if(i > greatest) greatest = i;

        for(int i = 0; i < arr.length; i++) {
            while(p_i < (greatest / 2)) {
                for(int j = 0; j < arr.length; j++)
                    if(arr[j] == arr[i] + p_i) progression.add(arr[j], arr[i]);
                p_i++;
            }
            for(int j : progression) System.out.println(j);
            progression = new ArrayList<>();
        }

    }
}