#isabelle andre
#17/07/18
#iterators

string = "1234567890"

# for char in string:
#     print(char)
iterator = iter(string)                 #goes through list
print(iterator)                         #for loops create iterators
print(next(iterator))
print(next(iterator))

for char in string:
    print(char)

for char in iter(string):
    print(char)


weapons = ["staff", "broadsword", "spear", "sai", "tonfa", "daggers", "doubles"]

item = iter(weapons)
for n in range(0, len(weapons)):
    print(next(item))

for n in weapons:
    print(n)