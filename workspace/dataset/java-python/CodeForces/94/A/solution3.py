"""
def main():
    t = int(input())
    for _ in range(t):
        n,m = sep()
        a=list(sep())
        b=list(sep())
        ans=0
        a = sorted(a,reverse=True)
        for i in range(n):
            if a[i]>=i+1:
                ans+=b[i]
            else:
                ans+=b[a[i]-1]
        print(ans)
if __name__ == '__main__':
    main()
"""

"""
def main():
    n=int(input())
    x = int(input())
    p=7-x
    for i in range(n):
        c = list(sep())
        if x in c or p in c:
            print("NO")
            break
    else:
        print("YES")
if __name__ == '__main__':
    main()
"""
"""
def main():
    s,k = sep()
    a=[0,1]
    ans=[]
    #print(ans)
    while(a[-1]<s):
        a.append(sum(a[-k:]))
    a.reverse()
    #print(list(a))
    for i in a:
        if i<=s:
            ans.append(i)
            s-=i
    print(len(ans))
    print(*ans)
if __name__ == '__main__':
    main()
"""


def sep(): return map(int, input().split())


"""
def main():
    n = int(input())
    a = list(sep())
    d = {}
    f = True
    for i in range(n):
        if (f == False):
            break
        for j in range(i):
           # print(d)

            if (a[i] + a[j] in d):
                ii, jj = d[a[i] + a[j]]
                if (len(set([i, j, ii, jj])) == 4):
                    print('YES')
                    f = False
                    print(i + 1, j + 1, ii + 1, jj + 1)
                    break
        
            else:
                d[a[i] + a[j]] = (i, j)

    if (f):
        print('NO')
if __name__ == '__main__':
    main()
"""


def main():
    s = input()
    d = {}
    i = -1
    for _ in range(10):
        i += 1
        t = input()
        d[t] = i
    # print(d)
    j = 0
    while (j < 80):
        print(d[s[j:10 + j]], end="")
        j += 10


if __name__ == '__main__':
    main()
