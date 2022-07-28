n = int(input())s = set(list(map(int,input().split()))[1:] + list(map(int,input().split()))[1:])s.discard(0)if len(s) == n:    print("I become the guy.")else:    print("Oh, my keyboard!")
