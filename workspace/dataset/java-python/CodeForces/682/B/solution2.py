n=int(input())ar=list(map(int,input().split()));ar=sorted(ar)ele=1for i in range(n): if ar[i]>=ele:ele+=1print(ele)
