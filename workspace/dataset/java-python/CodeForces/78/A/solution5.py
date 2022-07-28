s1 = input()
s2 = input()
s3 = input()
count1, count2, count3 = 0, 0, 0
for i in s1:    if
i in ["a", "e", "i", "o", "u"]: count1 += 1
for i in s2:    if
i in ["a", "e", "i", "o", "u"]: count2 += 1
for i in s3:    if
i in ["a", "e", "i", "o", "u"]: count3 += 1 if count1 == 5 and count2 == 7 and count3 == 5:
    print("YES")else:
    print("NO")
