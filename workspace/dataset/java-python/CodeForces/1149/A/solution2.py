import sysimport mathdef fn(n,a):    cnt=[0]*2    for i in range(n):        cnt[a[i]-1]=cnt[a[i]-1]+1        if cnt[0]==0 or cnt[1]==0:        for i in range(n):            print(a[i],end=' ')        return 0        if cnt[0]%2!=0:        print(2,end=' ')        for i in range(cnt[0]):            print(1, end=' ')        for i in range(cnt[1]-1):            print(2,end = ' ')    elif cnt[0]%2==0:        print(2,end=' ')        print(1,end=' ')        for i in range(cnt[1]-1):            print(2,end = ' ')        for i in range(cnt[0]-1):            print(1,end=' ')                    if __name__ == '__main__':        input = sys.stdin.read()    data = list(map(int, input.split()))    n = int(data[0])    a = data[1:]    (fn(n,a))