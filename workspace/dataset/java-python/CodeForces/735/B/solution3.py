def solve (n,t1,t2,seq) :    seq.sort(reverse=True)    mini = min(t1,t2)    maxi = max(t1,t2)        mean1 = sum(seq[:mini])/mini    mean2 = sum(seq[mini:maxi+mini])/maxi        return mean1 + mean2        n , t1 ,t2 = list(map(int,input().split()))seq = list(map(int,input().split())) print (solve(n,t1,t2,seq))       
