k = int(input().split()[1])s = input().strip(".#")print("NO" if (len(s)-1)%k or "#" in s[0:len(s):k] else "YES")
