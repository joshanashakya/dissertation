numbers=[]numbers = [int(item) for item in input().split()]numbers.sort()if((numbers[0]+numbers[5]+numbers[1])==(numbers[2]+numbers[3]+numbers[4])):    print("Yes")elif((numbers[2]+numbers[5]+numbers[1])==(numbers[0]+numbers[3]+numbers[4])):    print("Yes")elif((numbers[0]+numbers[5]+numbers[2])==(numbers[1]+numbers[3]+numbers[4])):    print("Yes")elif((numbers[0]+numbers[5]+numbers[3])==(numbers[2]+numbers[1]+numbers[4])):    print("Yes")elif((numbers[0]+numbers[5]+numbers[4])==(numbers[2]+numbers[1]+numbers[3])):    print("Yes")else:    print("No")