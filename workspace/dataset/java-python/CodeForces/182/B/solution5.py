def main():    d = int(input())    n = int(input())    arr = list(map(int,input().split()))    s1=0    for i in range(n-1):        s1+=(d-arr[i])    print(s1)if __name__ == '__main__':    main()
