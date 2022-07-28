b=int(input())c=int(b**.5)print(2*sum(b%i==0for i in range(1,c+1))-(c*c==b))
