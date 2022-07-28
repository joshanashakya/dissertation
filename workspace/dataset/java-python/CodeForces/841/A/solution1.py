import collectionsa, b = map(int, input().split())s = input()count = collections.Counter(s).most_common(1)[0][1] if count > b:    print("NO")else:    print("YES")
