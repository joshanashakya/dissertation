a=input().split()n=int(input())print(*a)for _ in range(n):    b=input().split()    a.remove(b[0])    a.append(b[1])    print(*a)
