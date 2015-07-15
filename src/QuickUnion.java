/**
 * Created by deadlydragon00 on 7/15/2015.
 */
public class QuickUnion {

    public static void main(String[] args) {
        QuickUnion pol = new QuickUnion(10);

        pol.union(3, 5);
        pol.union(5, 6);
        pol.union(3, 1);
        pol.union(8, 0);
        pol.union(8, 2);
        pol.union(9, 3);

        // check if 5 and 6 are connected
        System.out.println(pol.connected(5, 6));
    }


    private int[] id;

    /***
     * Initialize the elements
     *
     * @param n ist he number of element
     */
    QuickUnion(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    /***
     * Connect both points p and q.
     *
     * @param p the first site
     * @param q the second site
     */
    void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);
        // cancel if they are already connected!
        if (pid == qid)
            return;

        id[qid] = pid;
    }

    /***
     * Test the connection of both site.
     *
     * @param p the first site
     * @param q the second site
     * @return true if both sites are connected otherwise false.
     */
    boolean connected(int p, int q) {
        // compare both roots if similar
        return root(p) == root(q);
    }

    /***
     * Find the root on an element.
     *
     * @param val the element
     * @return the root on an element.
     */
    private int root(int val) {
        int root = val;
        while (root != id[root]) {
            root = id[root];
        }
        return root;
    }


}
