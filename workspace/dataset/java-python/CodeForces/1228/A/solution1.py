l,r=map(int,input().split())while(l<=r)&(len(set(str(l)))<len(str(l))):l+=1print((l,-1)[l>r])
