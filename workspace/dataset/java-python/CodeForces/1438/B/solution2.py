for _ in range(int(input())):    n = int(input())
a = list(map(int, input().split()))
l1 = list(set(a))
if len(a) == len(l1):
    print("NO")    else:
    print("YES") 
