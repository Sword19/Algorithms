__author__ = 'Sword'


class QuickFind:

    def __init__(self, int_list):
        self.int_list = int_list


    def union(self, int_list, p, q):
        pid = self.int_list[p]
        qid = self.int_list[q]
        for i in range(len(self.int_list)):
            if self.int_list[i]==pid:
                self.int_list[i]=qid

    def isConnected(self, p, q):
        return self.int_list[p]== self.int_list[q]

    def __str__(self):
        initial_list = ''
        for x in self.int_list:
            initial_list = initial_list + str(x)
        return initial_list





def main():
    my_list = [i for i in xrange(0,10)]
    pol = QuickFind(my_list)
    print pol
    pol.union(pol, 3, 5)
    pol.union(pol, 5, 6)
    pol.union(pol, 3, 1)
    pol.union(pol, 8, 0)
    pol.union(pol, 8, 2)
    pol.union(pol, 9, 3)

    print pol.isConnected(3,0)



if __name__ == "__main__":
    main()





