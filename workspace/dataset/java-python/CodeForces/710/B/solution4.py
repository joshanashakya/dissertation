if __name__ == "__main__":    n = int(input())    arr = list(map(int, input().split()))    arr.sort()    print(arr[(1+n)//2-1])
