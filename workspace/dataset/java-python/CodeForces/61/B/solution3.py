from collections import Counter


def cleanup(s):    return "".join([item.lower() for item in s if item.isalpha()])


s1 = cleanup(input())
s2 = cleanup(input())
s3 = cleanup(input())
n = int(input())
for test in range(n):    st = cleanup(input())
c1 = Counter(st)
c2 = Counter(s1 + s2 + s3)
if c1 != c2:        print("WA")
continue
sorted_strings = sorted([s1, s2, s3], key=len)
if sorted_strings[2] in st:
    st = st.split(sorted_strings[2])    else:
    print("WA")
continue
if sorted_strings[1] in st[0]:        st += st[0].split(sorted_strings[1])
st = st[1:] elif sorted_strings[1] in st[1]: last = st.pop()
st += last.split(sorted_strings[1]) else:        print("WA")
continue
if sorted_strings[0] in st:
    print("ACC")    else:
    print("WA")
