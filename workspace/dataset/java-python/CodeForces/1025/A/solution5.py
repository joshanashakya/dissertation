n = int(input())s = input()a = [0] * 26for i in s:    a[ord(i) - ord('a')] += 1a.sort(reverse=True)if a[0] > 1 or n == 1:    print("Yes")else:    print("No")
