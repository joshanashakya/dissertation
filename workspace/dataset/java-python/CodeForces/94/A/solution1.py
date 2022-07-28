encrypted_password = input()
numbers = []

for i in range(10):
    numbers.append(input())

characters = ""
original_password = ""

for i in encrypted_password:
    characters += i

    if (len(characters) == 10):
        for j in range(len(numbers)):
            if (characters == numbers[j]):
                original_password += str(j)
        flag = 0
        characters = ""

print(original_password)
