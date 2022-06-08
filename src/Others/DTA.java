package Others;

public class DTA {

    public static void main(String[] args) {

        int n = 100;
        // n-2
        for (int i=2; i<n; i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }

        // √n-2
        for (int i=2; i<Math.sqrt(n); i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }

    }

}
