s, v1, v2, t1, t2=map(int,input().split())n1=s*v1+t1*2n2=s*v2+t2*2if n1!=n2:    if n1<n2:        print('First')    else:        print('Second')else:    print('Friendship')
