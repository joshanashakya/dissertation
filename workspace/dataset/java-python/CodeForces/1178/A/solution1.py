n=int(input())lst=list(map(int,input().split()))ans=[1]summ2=lst[0]for i in range(1,n):    if lst[0]>=(2*lst[i]):        ans.append(i+1)        summ2+=lst[i]summ=sum(lst)#print(ans)if (summ//2)<summ2:    print(len(ans))    print(*ans)else:    print('0')
