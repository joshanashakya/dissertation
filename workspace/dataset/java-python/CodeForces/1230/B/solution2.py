if __name__=="__main__":    n,k=map(int,input().split())    st=input()    c=0    ans=""    if k==0:        ans=ans+st    elif n==1:        ans=ans+'0'    else:        for i in range(n):            if c < k:                if i == 0 and st[i] != '1':                    ans=ans+'1'                    c = c + 1                elif st[i] != '0' and i != 0:                    ans=ans+'0'                    c = c + 1                else:                    ans=ans+st[i]            else:                ans=ans+st[i]    print(ans)