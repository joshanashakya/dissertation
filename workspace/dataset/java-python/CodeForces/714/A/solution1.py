if __name__=="__main__":    a,b,c,d,k=map(int,input().split())    start=max(a,c)    end=min(b,d)    ans=end-start    if ans<0:        ans=0    elif k<start or k>end:        ans=ans+1    print(ans)
