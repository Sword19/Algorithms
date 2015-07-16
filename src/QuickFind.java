/**
 * Created by deadlydragon00 on 7/15/2015.
 */
public class QuickFind {

    public static void main(String[] args) {
        QuickFind pol = new QuickFind(10);

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
    QuickFind(int n) {
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
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid)
                id[i] = qid;
    }

    /***
     * Test the connection of both site.
     *
     * @param p the first site
     * @param q the second site
     * @return true if both sites are connected otherwise false.
     */
    boolean connected(int p, int q) {
        return id[p] == id[q];
    }

}
