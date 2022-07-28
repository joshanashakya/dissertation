a=str(input())import collectionscnt=collections.Counter(a)ans=min({(cnt['n'] - 1) //2, cnt['e'] // 3, cnt['i'], cnt['t']})if ans<1:    print(0)else:    print(ans)
