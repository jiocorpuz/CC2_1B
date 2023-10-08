# 1.
x = 5 # number of rows
for y in range(1, x + 1): #
    for z in range(1, y + 1):
        print(z, end=" ")
    print()

# 2.
x = int(input("input: "))  # Input: 4 in this case
sum_result = 0

print("formula: 1+2+3+4")

for y in range(1, x + 1):
    sum_result += y
print("output:", sum_result)

# 3.
x = 5
for y in range(x, 0, -1):
    for z in range(1, y + 1):
        print(z, end=" ")
    print()
