def maxSum(arr,p,q,r):    premax=-214748364800000000000000000000000000000    postmax=-2147483648000000000000000000000000000000    maxx=-214748364800000000000000000000000000000000000    pre=[]    post=[]    for i in arr:        premax=max(p*i,premax)        pre.append(premax)    for j in range(len(arr)-1,-1,-1):        postmax=max(r*arr[j],postmax)        post.append(postmax)    for i in range(0,len(arr)):        summ=0        summ=q*arr[i]+pre[i]+post[len(arr)-i-1]        maxx=max(summ,maxx)    return maxxn,p,q,r=[int(v) for v in input().split()]arr=[int(v) for v in input().split()][:n]print(maxSum(arr,p,q,r))