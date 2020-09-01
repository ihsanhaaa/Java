import java.util.Stack;

/**
 * stack
 */
public class stack {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<Integer>();

        // simpan data
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        // hapus data
        System.out.println("Setelah dihapus indeks paling atas");
        st.pop();
        System.out.println(st);

        // mengambil data paling
        System.out.println("Mengambil data paling atas: " + st.peek());

    }
}