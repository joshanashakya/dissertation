if __name__ == '__main__':    t = int(input())    while t>0:        t-=1        n,k = map(int,input().split())        alist = input("")        alist = [int(n) for n in alist.split()]        blist = input("")        blist = [int(n) for n in blist.split()]        res = sum(alist)        while k > 0:            k -= 1            alist.sort()            blist.sort()            if alist[0] < blist[n-1]:                res += blist[n-1] - alist[0]                tmp = alist[0]                alist[0] = blist[n-1]                blist[n-1] = tmp            else:                break        print(res) 
