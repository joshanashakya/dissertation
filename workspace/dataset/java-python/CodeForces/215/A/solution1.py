#laddder 11#119A '''def main():    from sys import stdin, stdout    a=[0,1,1]    for _ in range(43):        a.append(a[-1]+a[-2])    #print(a)    #print(len(a))    #print(a[-1])     n = int(stdin.readline())    if n==0:        print(0,0,0)        return    fp = 0    sp = 45    while fp<sp:        if a[fp]+a[sp] == n:            break        elif a[fp]+a[sp] < n:            fp+=1        elif a[fp]+a[sp] > n:            sp-=1     if a[fp]+a[sp]==n:        stdout.write(str(a[fp])+' '+str(a[sp-2])+' '+str(a[sp-1])+'\n')    else:        stdout.write("I'm too stupid to solve this problem\n") if __name__=='__main__':    main()''' #320A'''def main():    from sys import stdin,stdout     state = [                [-1,1,-1,-1,-1,-1,-1,-1,-1,-1],                [-1,1,-1,-1,2,-1,-1,-1,-1,-1],                [-1,1,-1,-1,3,-1,-1,-1,-1,-1],                [-1,1,-1,-1,-1,-1,-1,-1,-1,-1],                [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],                [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],                [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],                [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],                [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],                [-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],            ]     number = [int(x) for x in list(stdin.readline().strip())]    #print(number)    curr = 0;    for i in number:        #print(i,curr,state[curr][i])                curr = state[curr][i]        if curr == -1:            break    if curr == -1:        stdout.write('NO\n')    else:        stdout.write('YES\n')  if __name__=='__main__':    main()''' #43A'''def main():    from sys import stdin, stdout    import collections        c = collections.Counter()    for _ in range(int(stdin.readline())):        c[stdin.readline().strip()]+=1    print(c.most_common()[0][0]) if __name__=='__main__':    main()''' #215Adef main():    from sys import stdin, stdout    n = int(stdin.readline())    a = list(map(int,stdin.readline().split()))    m = int(stdin.readline())    b = list(map(int,stdin.readline().split()))        ans = {}    for i in b:        for j in a:            if i%j==0:                if i//j in ans:                    ans[i//j]+=1                else:                    ans[i//j]=1     stdout.write(str(ans[max(ans.keys())])+'\n')  if __name__=='__main__':    main()
