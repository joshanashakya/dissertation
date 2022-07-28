from collections import Counter  

def SomRas(s):    return "".join([item.lower() for item in s if item.isalpha()])

                naradmuni = SomRas(input())
vedvyas = SomRas(input())
RishiMuni = SomRas(input()) n = int(input())
for test in range(n):    koi_dikkat = SomRas(input())     was_a_thing = Counter(koi_dikkat)
maybe_a_thing = Counter(naradmuni + vedvyas + RishiMuni)     if was_a_thing != maybe_a_thing:        print("WA")
continue     sort_kiya_hua_cheez = sorted([naradmuni, vedvyas, RishiMuni], key=len)     if sort_kiya_hua_cheez[
    2] in koi_dikkat:
    koi_dikkat = koi_dikkat.split(sort_kiya_hua_cheez[2])    else:
    print("WA")
continue     if sort_kiya_hua_cheez[1] in koi_dikkat[0]:        koi_dikkat += koi_dikkat[0].split(
    sort_kiya_hua_cheez[1])
koi_dikkat = koi_dikkat[1:]  elif sort_kiya_hua_cheez[1] in koi_dikkat[1]: last = koi_dikkat.pop()
koi_dikkat += last.split(sort_kiya_hua_cheez[1])  else:        print("WA")
continue     if sort_kiya_hua_cheez[0] in koi_dikkat:
    print("ACC")    else:
    print("WA")
