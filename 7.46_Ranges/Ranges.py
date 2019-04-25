#isabelle andre
#20/07/18
#ranges

print(range(100))
list1 = list(range(10))
print(list1)

even = list(range(0,10,2))
odd = list(range(1, 10, 2))

print(even)
print(odd)

alphabet = "abcdefghijklmnopqrstuvwxyz"
print(alphabet.index('e'))                      #prints char position
print(alphabet[4])

dec = range(0, 10)
print(dec)

print(dec.index(3))

odd = range(1, 10000, 2)
print(odd)

print(odd(985))                 #prints 985th odd number

sevens = range(7, 1000000, 7)
x = int(input("Enter a positive number less than one million: "))
if x in sevens:
    print("{} is divisible by seven".format(x))

print(dec)
range1 = dec[::2]
print(range1)
print(range1.index(4))

decimals = range(0, 100)
print(decimals)
range1 = decimals[3:40:3]
print(range1)

for i in range1:
    print(i)

print('=' * 40)
for i in range(3, 40, 3):
    print(i)

#############

decimals = range(0, 100)
range1 = decimals[3:40:3]
print(range1 == range(3, 40, 3))
print(range(0, 5, 2) == range(0, 6, 2))
print(list(range(0, 5, 2)))
print(list(range(0, 6, 2)))

r = range(0, 100)
print(r)

for i in r[::-2]:
    print(i)

print('=' * 50)
for i in range(99, 0, -2):
    print(i)

print('=' * 50)
print(range(0, 100)[::-2] == range(99, 0, -2))

for i in range(0, 100, -2):
    print(i)

backString = "egaugnal lufrewop yrev a si nohtyP"
print(backString[::-1])

r = range(0, 10)
for i in r[::-1]:
    print(i)

#############


