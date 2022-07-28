size=int(input())num1=list(map(int,input().split(' ')))nums2=list(map(int,input().split(' ')))sum1=sum(num1)sum2=sum(nums2)if sum2<=sum1:    print('Yes')else:    print('No')
