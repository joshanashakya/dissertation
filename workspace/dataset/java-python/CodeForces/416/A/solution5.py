left=-2000000000right=2000000000 for _ in range(int(input())):    temp=input().split()    sign=temp[0]    n=int(temp[1])    tf=temp[2]    if tf=='Y':        if sign=='>' and left<=n:            left=n+1        elif sign=='>=' and left<n:            left=n        elif sign=='<' and right>=n:            right=n-1        elif sign=='<=' and right>n:            right=n    elif tf=='N':        if sign=='>' and right>n:            right=n        elif sign=='>=' and right>=n:            right=n-1        elif sign=='<' and left<n:            left=n        elif sign=='<=' and left<=n:            left=n+1if left<=right:    print(left)else:    print('Impossible')
