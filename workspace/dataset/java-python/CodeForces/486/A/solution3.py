n=int(input())if n%2==0:    ne=n//2    no=n//2else:    no=n//2+1    ne=n-noprint(ne*(ne+1)-pow(no,2))
