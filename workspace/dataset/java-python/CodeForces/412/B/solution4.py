if __name__ == "__main__":    n,k = list(map(int, input().split()))    arr = list(map(int,input().split()))    arr.sort()    arr = arr[::-1]    for i in range(n):        if i+1 == k:            print(arr[i])            break